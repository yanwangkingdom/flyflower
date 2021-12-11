package com.yw.ffmpegj;

import java.nio.ByteBuffer;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;

public class FFAudioData {
	
	PointersWithBuffers pointersWithbuffers;
	
	
	
	int srcsamplerate;
	
	
	int targetsamplerate;
	
	int channel;
	
	int srcbytepersample;
	int targetbytepersample;
	
	ByteBuffer adptobuffer;
	
	int srcnbsamples;
	int targetnbsamples;
	
	
	
	long pts_blurwritensample;//不是很准确的一个值 这个值就是pts代表了一帧音频位于整个音频文件中的第几个采样
	double frameendtime;// 这个变量代表了 播放完一帧音频 总共需要的时间 是以秒为单位的
	AudioToolAndReccyclebin aurecycleandtool;
	long aupktpts;
	
	Pointer audiodata;
	
	 
	 
	public PointersWithBuffers getPointersWithbuffers() {
		return pointersWithbuffers;
	}
	public void setPointersWithbuffers(PointersWithBuffers pointersWithbuffers) {
		this.pointersWithbuffers = pointersWithbuffers;
	}
	public long getAupktpts() {
		return aupktpts;
	}
	protected void setAupktpts(long aupktpts) {
		this.aupktpts = aupktpts;
	}
	public AudioToolAndReccyclebin getAurecycleandtool() {
		return aurecycleandtool;
	}
	protected void setAurecycleandtool(AudioToolAndReccyclebin aurecycleandtool) {
		this.aurecycleandtool = aurecycleandtool;
	}
	public ByteBuffer getAdptobuffer() {
		return adptobuffer;
	}
	protected void setAdptobuffer(ByteBuffer adptobuffer) {
		this.adptobuffer = adptobuffer;
	}
	public int getSrcBytepersample() {
		return srcbytepersample;
	}
	protected void setSrcBytepersample(int bytepersample) {
		this.srcbytepersample = bytepersample;
	}
	
	
	
	
	public int getTargetbytepersample() {
		return targetbytepersample;
	}
	
	
	public void setTargetbytepersample(int targetbytepersample) {
		this.targetbytepersample = targetbytepersample;
	}
	
	
	public Pointer getAudiodata() {
		return audiodata;
	}
	protected void setAudiodata(Pointer audiodata) {
		this.audiodata = audiodata;
	}
	public int getSrcSamplerate() {
		return srcsamplerate;
	}
	protected void setSrcSamplerate(int samplerate) {
		this.srcsamplerate = samplerate;
	}
	

	public int getTargetsamplerate() {
		return targetsamplerate;
	}
	public void setTargetsamplerate(int targetsamplerate) {
		this.targetsamplerate = targetsamplerate;
	}
	
	public int getChannel() {
		return channel;
	}
	protected void setChannel(int channel) {
		this.channel = channel;
	}
	
	
	public int getSrcnbsamples() {
		return srcnbsamples;
	}
	public void setSrcnbsamples(int srcnbsamples) {
		this.srcnbsamples = srcnbsamples;
	}
	public int getTargetSamplesperframe() {
		return targetnbsamples;
	}
	protected void setTargetSamplesperframe(int samplesperframe) {
		this.targetnbsamples = samplesperframe;
	}
	public long get_pts_Blurwritensample() {
		return pts_blurwritensample;
	}
	public void set_pts_Blurwritensample(long blurwritensample) {
		this.pts_blurwritensample = blurwritensample;
	}
	public double getFrameendtime() {
		return frameendtime;
	}
	public void setFrameendtime(double frameendtime) {
		this.frameendtime = frameendtime;
	}
	
	
	
	
	
	public void clean(){
		srcsamplerate=0;
		channel=0;
		srcbytepersample=0;
		adptobuffer=null;
		targetnbsamples=0;
		pts_blurwritensample=0;//不是很准确的一个值 这个值就是pts代表了一帧音频位于整个音频文件中的第几个采样
		frameendtime=0;// 这个变量代表了 播放完一帧音频 总共需要的时间 是以秒为单位的
		
	}

}
