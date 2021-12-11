package com.yw.test;

import com.yw.ffmpegj.OnlyJavaFFEngine;

public class TestOnlyJavaffmpeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("ffmpegj.audiodebug", "false");
		String filtename="rtsp://officetv.bupt.edu.cn/HNWS";
		//String filtename="E:/02.flv";
		//String filtename="E://liyugang/lihuasong.flv";
		OnlyJavaFFEngine engine=new OnlyJavaFFEngine(filtename);

	}

}
