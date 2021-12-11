/*
 * Created on 29.06.2004
 *
 */
package com.yw.startv;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;





/**
 * A RingBuffer to be used with DoubleHalfBuffers.
 * @author Manu Robledo
 *
 */
class RingBuffer {
	
	public ByteBuffer buffer;
	public final MyBuffer readBuffer,writeBuffer;
	
	public boolean writeAhead = false;
	public RingBuffer(int size) {
    buffer=ByteBuffer.allocate(size);
	readBuffer=new MyBuffer();
	writeBuffer=new MyBuffer();

	}
	/**
	 * Get the number of bytes currently available for reading
	 * @return The number of bytes avilable for reading
	 */
	public  int readAvailable(){
		
		int readPos = readBuffer.position();
		int writePos = writeBuffer.position();
		if(readPos < writePos) return writePos - readPos;
		else if(readPos > writePos || writeAhead) return readBuffer.remaining() + writePos;
		else return 0;
	}
	/**
	 * Get the number of bytes currently available for writing
	 * @return The number of bytes available for writing
	 */
	public  int writeAvailable(){
		int readPos = readBuffer.position();
		int writePos = writeBuffer.position();
		if(writePos < readPos) return readPos - writePos;
		else if(writePos > readPos || !writeAhead) return writeBuffer.remaining() + readPos;
		else return 0;
	}
	/**
	 * Try to read <code>len</code> bytes from this buffer starting at the
	 * current position into <code>b</code> starting at position
	 * <code>off</code>. The currently avilable bytes will be read the number
	 * of bytes read will be returned.
	 * @param b The byte array to transfer the data to
	 * @param off The offset inside the target array
	 * @param len The number of bytes to read
	 * @return The number of bytes read
	 */
	public int read(byte[] b, int off, int len){
		return read(b, off, len, false);
	}
	/**
	 * Try to read <code>len</code> bytes from this buffer starting at the
	 * current position into <code>b</code> starting at position
	 * <code>off</code>. If <code>overwrite</code> is true, the bytes will be
	 * read independent of the number of available bytes for reading. If this
	 * read operation exceeds the current write position (buffer underrun), the
	 * write position will be discarded and set to the end of the read data.
	 * @param b The byte array to transfer the data to
	 * @param off The offset inside the target array
	 * @param len The number of bytes to read
	 * @param overwrite true, if the given number of bytes should be read even
	 * if this causes a buffer underrun
	 * @return The number of bytes read 
	 */
	public int read(byte[] b, int off, int len, boolean overwrite){
		
		if(off + len > b.length) throw new IllegalArgumentException("Can´t read " + len + " bytes beginning at offset " + off + " into Array of length " + b.length);
		
			int readPos = readBuffer.position();
			if(!overwrite) len = Math.min(len, readAvailable());
			else len = Math.min(len, size());
			if(len == 0) return 0;
			
			int available = readBuffer.remaining();
			if(available < len){
				readBuffer.get(b, off, available);
				readBuffer.rewind();
				readBuffer.get(b, off + available, len - available);
				if(readBuffer.position() == readBuffer.limit()) readBuffer.rewind();
			}
			else{
				readBuffer.get(b, off, len);
				if(readBuffer.position() == readBuffer.limit()) readBuffer.rewind();
			}
			if(overwrite){
				if(len == size() ||
					readBuffer.position() == writeBuffer.position() ||
					(readPos < writeBuffer.position() && readPos + len > writeBuffer.position()) ||
					(readPos > writeBuffer.position() && readPos + len - size() >= writeBuffer.position()) ||
					(readPos == writeBuffer.position() && !writeAhead)
				){
					writeBuffer.position(readBuffer.position());
					writeAhead = false;
				}
			}
			else{
				if(readBuffer.position() == writeBuffer.position()) writeAhead = false;
			}
		
		
		return len;
	}
	/**
	 * Try to write <code>len</code> bytes from <code>b</code> starting at
	 * index <code>off</code> into this buffer starting at the current position.
	 * This method will not return before the given number of bytes has been
	 * written or the buffer has been closed. This means that if the given
	 * number of bytes can not be written at once, this methods waits until
	 * another thread empties the needed part of this buffer by reading from it.
	 * @param b The array containing the data to write
	 * @param off Start position inside the given array
	 * @param len The number of bytes to write
	 * @return The number of bytes written
	 */
	public int write(byte[] b, int off, int len){
		return write(b, off, len, false);
	}
	/**
	 * Try to write <code>len</code> bytes from <code>b</code> starting at
	 * index <code>off</code> into this buffer starting at the current position.
	 * This method will not return before the given number of bytes has been
	 * written or the buffer has been closed. If <code>overwrite</code> is set
	 * to true, this method will write the data immediately independent of the
	 * number of bytes available for writing. If the read position is exceeded
	 * by this operation (buffer overflow), the read position will be set after
	 * the last written data.
	 * @param b The array containing the data to write
	 * @param off Start position inside the given array
	 * @param len The number of bytes to write
	 * @param overwrite true, if the given number of bytes should be written
	 * even if this causes a buffer overflow
	 * @return The number of bytes written
	 */
	public int write(byte[] b, int off, int len, boolean overwrite){
		
		if(off + len > b.length) throw new IllegalArgumentException("Can´t write " + len + " bytes beginning at offset " + off + " from Array of length " + b.length);
		int written = 0;
		
			while(len > written ){
				while(writeAvailable() == 0 && !overwrite) try{ wait(1000); } catch(InterruptedException e){}
				int toWrite;
				int writePos = writeBuffer.position();
				if(overwrite) toWrite = Math.min(len, size());
				else toWrite = Math.min(len - written, writeAvailable());
				int available = writeBuffer.remaining();
				if(available <= toWrite){
					writeBuffer.put(b, off + written, available);
					written += available;
					writeBuffer.rewind();
					writeBuffer.put(b, off + written, toWrite - available);
					written += toWrite - available;
					if(writeBuffer.position() == writeBuffer.limit()) writeBuffer.rewind();
				}
				else{
					writeBuffer.put(b, off + written, toWrite);
					written += toWrite;
					if(writeBuffer.position() == writeBuffer.limit()) writeBuffer.rewind();
				}
				if(toWrite > 0){
					if(overwrite){
						if(toWrite == size() ||
							(writePos < readBuffer.position() && writePos + toWrite > readBuffer.position()) ||
							(writePos > readBuffer.position() && writePos + toWrite - size() >= readBuffer.position()) ||
							(writePos == readBuffer.position() && writeAhead)
						){
							readBuffer.position(writeBuffer.position());
						}
					}
					writeAhead = true;
				}
			}
			/*if(len > 0 && !isOpen()){
				len = Math.min(len, writeAvailable());
				int available = writeBuffer.remaining();
				if(available <= len){
					writeBuffer.put(b, off + written, available);
					written += available;
					writeBuffer.rewind();
					writeBuffer.put(b, off + written, len - available);
					written += len - available;
				}
				else{
					writeBuffer.put(b, off + written, len);
					written += len;
				}
				writeAhead = true;
			}*/
		
		return written;
	}
	
	public int size(){
		return readBuffer.capacity();
	}
	/**
	 * Empty this buffer
	 *
	 */
	public  void flush(){
		writeBuffer.rewind();
		readBuffer.rewind();
		writeAhead = false;
	}
	/**
	 * Rewind this buffer
	 *
	 */
	public  void rewind(){
		readBuffer.rewind();
		writeBuffer.rewind();
		writeAhead = false;
	}
	/**
	 * Set the read and write position of this Buffer
	 * @param readPos The new read position
	 * @param writePos The new write position
	 * @param writeAhead Only needed, if <code>readPos == writePos</code>:<br>
	 * true, if the writePos is ahead of the readPos and the buffer is therefore
	 * filled, false if the buffer is empty. 
	 */
	public  void setPositions(int readPos, int writePos, boolean writeAhead){
		writeBuffer.position(writePos);
		readBuffer.position(readPos);
		if(writePos == readPos) this.writeAhead = writeAhead;
		else writeAhead = true;
	}
	class MyBuffer {
		
		private int limit,position;
		
		private final int capacity;
		
		public MyBuffer() {
			
			limit = capacity = buffer.limit();
			position = 0;
		}
		
		
		public MyBuffer duplicate(){
			return new MyBuffer();
		}
		/**
		 * Absolute get method. Reads the byte at the given position.
		 * @param position The position fromo which the byte will be read
		 * @return The byte at the given position
		 * @see java.nio.ByteBuffer#get(int)
		 */
		
		public MyBuffer get(byte[] dst){
			return get(dst, 0, dst.length);
		}
		/**
		 * Relative bulk get method. This method transfers <code>length</code> bytes
		 * from this buffer into the given destination array starting at
		 * <code>offset</code>.
		 * @param dst The destination array to transfer the data to
		 * @param offset The offset within the array of the first byte to be
		 * written; must be non-negative and no larger than dst.length
		 * @return This buffer
		 */
		public MyBuffer get(byte[] dst, int offset, int length){
			if(remaining() < length) throw new BufferUnderflowException();
			if(offset < 0 || length < 0 || offset + length > dst.length) throw new IndexOutOfBoundsException();
			buffer.position(position);
			buffer.get(dst, offset, length);
			buffer.rewind();
			position += length;
			return this;
		}
		/**
		 * Absolute put method. Writes the given byte into this buffer at the given
		 * position.
		 * @param position The position at which the byte will be written
		 * @param value The byte value to be written
		 * @return This buffer
		 */
		
		
		/**
		 * Relative bulk put method. 
		 * This method transfers the entire content of the given source
		 * byte array into this buffer. An invocation of this method of the form
		 * <code>dst.put(a)</code> behaves in exactly the same way as the invocation
		 * <code>dst.put(a, 0, a.length)</code>.
		 * @param src The array to copy the data from 
		 * @return This buffer
		 */
		public MyBuffer put(byte[] src){
			return put(src, 0, src.length);
		}
		/**
		 * Relative bulk put method. This method transfers <code>length</code> bytes
		 * from the given array starting at <code>offset</code> to this buffer 
		 * starting at the current position.
		 * @param src The array to copy the data from 
		 * @param offset Start position inside the given array
		 * @param length Number of bytes to put.
		 * @return This buffer
		 */
		public MyBuffer put(byte[] src, int offset, int length){
		
			if(remaining() < length) throw new BufferOverflowException();
			if(offset < 0 || length < 0 || offset + length > src.length) throw new IndexOutOfBoundsException();
			buffer.position(position);
		    buffer.put(src, offset, length);
		    buffer.rewind();
			
			position += length;
			return this;
		}
		
		public int capacity(){
			return capacity;
		}
		/**
		 * Clear this buffer by resetting its position to zero and its limit to its
		 * capacity.
		 * @return This buffer
		 */
		public MyBuffer clear(){
			position = 0;
			limit = capacity;
			return this;
		}
		/**
		 * Flips this buffer. The limit is set to the current position and then the
		 * position is set to zero. If the mark is defined then it is discarded.
		 * @return This buffer
		 */
		public MyBuffer flip(){
			limit = position;
			position = 0;
			return this;
		}
		/**
		 * Tells whether there are any elements between the current position and the
		 * limit.
		 * @return true, if there is at least one byte left in the buffer, false
		 * otherwise
		 */
		public boolean hasRemaining(){
			return position < limit;
		}
		/**
		 * Tells whether this buffer is read-only or not.
		 * @return true, if this buffer is read-only, false otherwise
		 */
		
		/**
		 * Get this buffer´s current limit
		 * @return This buffer´s current limit
		 */
		public int limit(){
			return limit;
		}
		/**
		 * Set this buffer´s limit
		 * @param limit The new limit
		 * @return This buffer
		 */
		public MyBuffer limit(int limit){
			this.limit = limit;
			return this;
		}
		/**
		 * Get his buffer´s current position
		 * @return This buffer´s current position
		 */
		public int position(){
			return position;
		}
		/**
		 * Set this buffer´s position
		 * @param pos The new position
		 * @return This buffer
		 */
		public MyBuffer position(int pos){
			position = pos;
			return this;
		}
		/**
		 * Get the number of bytes remaining between this buffer´s current position
		 * and its limit
		 * @return The number of bytes remining in this buffer
		 */
		public int remaining(){
			return Math.max(limit - position, 0);
		}
		/**
		 * Set this buffer´s position to zero
		 * @return This buffer
		 */
		public MyBuffer rewind(){
			position = 0;
			return this;
		}
		public String toString() {
			return super.toString() + " cap: " + capacity + ", pos: " + position + ", lim: " + limit;
		}
	}

}
