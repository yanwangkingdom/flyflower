package com.yw.ffmpegj;

public interface ToolAndRecyclebin {
	public void recycle(Connector connector);
	public void recyclePreAll(Connector connector);
	public void recycleUnused(Connector connector);
	public Connector getfilledConnector();
	
	public boolean isrealtime();
}
