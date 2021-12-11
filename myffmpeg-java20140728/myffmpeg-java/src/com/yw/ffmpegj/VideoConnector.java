package com.yw.ffmpegj;

public interface VideoConnector extends Connector{
	
	public boolean setData(final VideoPicture databox);
		
	public VideoPicture getData();
		
	

}
