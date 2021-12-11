package com.yw.test;

import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

public class DirectByteBuffer2Pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MappedByteBuffer bb  =   (MappedByteBuffer)ByteBuffer.allocateDirect(10);
		
		
		
       DirectByteBuffer dbb=(DirectByteBuffer)bb;
       System.out.println();
          
	}

}
