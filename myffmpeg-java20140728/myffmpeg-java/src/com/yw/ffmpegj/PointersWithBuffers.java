package com.yw.ffmpegj;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;

public class PointersWithBuffers {
	
	PointerByReference ppin;
	List <Pointer> pointers =new ArrayList <Pointer>();
	List <ByteBuffer> buffers=new ArrayList<ByteBuffer>();
	
	public void addPointer(Pointer p , int buflen){
		pointers.add(p);
		buffers.add(p.getByteBuffer(0, buflen));
	}

	public PointersWithBuffers() {
		Memory m=new Memory(8*Pointer.SIZE);
		ppin=new PointerByReference();
		ppin.setPointer(m);
	//System.out.println(m.size());	
	}
	
	
	
	
	
	public void clean(){
		
		buffers.clear();
		buffers=null;
		pointers.clear();
		pointers=null;
		if(ppin!=null){
			ppin=null;
		}
	    	
	}
	
	

}
