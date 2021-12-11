package com.yw.ffmpegj;

import java.nio.ByteBuffer;

public interface AudioConnector extends Connector{
	
	
	
	public boolean setData(FFAudioData audiodatabox);
	
	public FFAudioData getData();
		
	public ByteBuffer reusedbuffer();
		
	

}
