package com.yw.ffmpegj;

public interface AudioToolAndReccyclebin extends ToolAndRecyclebin{
     
	public int getSyncedAudio(AudioConnector ac ,double diff);
	
	public int  getSyncedAudioByGivenArray(AudioConnector ac, double diff,byte[] datapool);
	
	public double getDltdiff();
	
	public boolean isAudiofinished();
}
