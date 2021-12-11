/*
 * Created on 29.06.2004
 *
 */
package com.yw.startv;

import java.nio.ByteBuffer;

/**
 * A RingBuffer to be used with DoubleHalfBuffers.
 * @author Manu Robledo
 *
 */
public class 废弃RingBuffer {
	public ByteBuffer buffer;
	public int rtreadPos=0;
	public int rtwritePos=0;
	public int buffercapacity;
	/**
	 * 只要往这个缓存里写东西 ，写领先=true 比如我写进150个长度的数据 这个时候要读 ，如果我要读出120个长度的 写领先依然=true 如果我要读出
	 * 150长度的 这个写领先依然=true 如果我要读的是160长度的 这个时候 写领先=false
	 */
	public boolean writeAhead = false;
	/**
	 * Indicates whether this buffer is in open state or not
	 */
	
	
	public int read(byte[] b, int off, int len, boolean overwrite){
	
	
		if(off + len > b.length) throw new IllegalArgumentException("Can磘 read " + len + " bytes beginning at offset " + off + " into Array of length " + b.length);
		synchronized(this){
			int readPos = rtreadPos;
			if(!overwrite) len = Math.min(len, readAvailable());
			else len = Math.min(len, size());
			if(len == 0) return 0;
			
			int available = buffer.limit()-rtreadPos;//读缓存剩余的
			if(available < len){
				buffer.get(b, off, available);
				rtreadPos=buffer.position();
				buffer.rewind();
				rtreadPos=buffer.position();
				buffer.get(b, off + available, len - available);
				rtreadPos=buffer.position();
				if(buffer.position() == buffer.limit()){
					buffer.rewind();
				    rtreadPos=buffer.position();
				}
			}
			else{
				buffer.get(b, off, len);
				rtreadPos=buffer.position();
				if(buffer.position() == buffer.limit()) {
					buffer.rewind();
					rtreadPos=buffer.position();
				}
			}
			if(overwrite){
				if(len == size() ||
					rtreadPos == rtwritePos ||
					(readPos <rtwritePos && readPos + len > rtwritePos) ||
					(readPos >rtwritePos && readPos + len - size() >= rtwritePos) ||
					(readPos ==rtwritePos && !writeAhead)
				){
					rtwritePos=rtreadPos;
					writeAhead = false;
				}
			}else
			{
				if(rtreadPos == rtwritePos) writeAhead = false;
			}
			notify();
		}
		return len;
	}
	
	
	public int write(byte[] b, int off, int len, boolean overwrite){
		
		if(off + len > b.length) throw new IllegalArgumentException("Can磘 write " + len + " bytes beginning at offset " + off + " from Array of length " + b.length);
		int written = 0;
		synchronized(this){
			while(len > written ){
				while(writeAvailable() == 0 && !overwrite) try{ wait(1000); } catch(InterruptedException e){}
				int toWrite;
				int writePos =rtwritePos;
				if(overwrite) toWrite = Math.min(len, size());
				else toWrite = Math.min(len - written, writeAvailable());
				int available = buffer.limit()-rtwritePos;//写缓存剩余的
				if(available <= toWrite){
					buffer.put(b, off, available);
					rtwritePos=buffer.position();
					written += available;
					buffer.rewind();
					rtwritePos=buffer.position();
					buffer.put(b, off + written, toWrite - available);
					rtwritePos=buffer.position();
					written += toWrite - available;
					if(buffer.position() == buffer.limit()){
						
						buffer.rewind();
						rtwritePos=buffer.position();
					}
						
					
				}
				else{
					buffer.put(b, off + written, toWrite);
					rtwritePos=buffer.position();
					written += toWrite;
					if(buffer.position() == buffer.limit()) {
						buffer.rewind();
						rtwritePos=buffer.position();
					}
				}
				if(toWrite > 0){
					if(overwrite){
						if(toWrite == size() ||
							(writePos < rtreadPos&& writePos + toWrite > rtreadPos) ||
							(writePos > rtreadPos && writePos + toWrite - size() >= rtreadPos) ||
							(writePos == rtreadPos && writeAhead)
						){
							rtreadPos=rtwritePos;
						}
					}
					writeAhead = true;
				}
			}
			/*if(len > 0 ){
				len = Math.min(len, writeAvailable());
				int available = buffer.remaining();
				if(available <= len){
					buffer.put(b, off + written, available);
					written += available;
					buffer.rewind();
					buffer.put(b, off + written, len - available);
					written += len - available;
				}
				else{
					buffer.put(b, off + written, len);
					written += len;
				}
				writeAhead = true;
			}*/
		}
		return written;
	}
	
	public int size(){
		return buffer.capacity();
	}
	
	public synchronized void rewind(){
		buffer.rewind();
		rtreadPos=0;
		rtwritePos=0;
		writeAhead = false;
	}
	
	public synchronized int readAvailable(){
		
		
		if(rtreadPos < rtwritePos) return rtwritePos - rtreadPos;
		else if(rtreadPos > rtwritePos || writeAhead) return (buffer.limit()-rtreadPos )+ rtwritePos;//readBuffer.remaining() + writePos;
		else return 0;
	}
	
	public synchronized int writeAvailable(){
		
		if(rtwritePos < rtreadPos) return rtreadPos - rtwritePos;
		else if(rtwritePos > rtreadPos || !writeAhead) return (buffer.limit()-rtwritePos) + rtreadPos;//writeBuffer.remaining() + readPos
		else return 0;
	}
}
