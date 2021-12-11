package com.yw.ffmpegj;

import java.nio.ByteBuffer;

import com.sun.jna.Pointer;

/**
 * 抽象ffmpeg的videopicture 
 * @author wang
 *
 */
public class  VideoPicture {
	protected double pts;
	protected double duration;//这个变量意思是帧率 也就是一帧持续多少秒 
	protected int width,height;
	protected int serial;
	protected  ByteBuffer data;
    ToolAndRecyclebin vprecycle;
    boolean isforcecleaned=false;
    
	public ToolAndRecyclebin getVprecycle() {
		return vprecycle;
	}
	protected void setVprecycle(ToolAndRecyclebin vprecycle) {
		this.vprecycle = vprecycle;
	}
	public ByteBuffer getData() {
		return data;
	}
	protected void setData(ByteBuffer data) {
		this.data = data;
	}
	public double getPts() {
		return pts;
	}
	protected void setPts(double pts) {
		this.pts = pts;
	}
	public double getDuration() {
		return duration;
	}
	protected void setDuration(double duration) {
		this.duration = duration;
	}
	public int getWidth() {
		return width;
	}
	protected void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	protected void setHeight(int height) {
		this.height = height;
	}
	public int getSerial() {
		return serial;
	}
	protected void setSerial(int serial) {
		this.serial = serial;
	}
	
	

    public boolean isforcecleaned() {
		return isforcecleaned;
	}
	public void setIsforcecleaned(boolean isforcecleaned) {
		this.isforcecleaned = isforcecleaned;
	}
	public void clean(){
    	this.pts=0;
    	this.data=null;
    	this.duration=0;
    	this.height=0;
    	this.width=0;
    	this.serial=0;
    	
    }
}
