package com.yanwang.test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Vector;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.yanwang.iflyjava.Msp_cmnLibrary;
import com.yanwang.iflyjava.Msp_errorsLibrary;
import com.yanwang.iflyjava.Msp_typeLibrary;
import com.yanwang.iflyjava.QTTSLibrary;
import com.yanwang.iflyjava.QisrLibrary;

public class TestTTs {
	
	QisrLibrary isr=QisrLibrary.INSTANCE;
	
	QTTSLibrary tts=isr;
	
	Msp_cmnLibrary cmn=isr;
	
	String login_configs=" appid = 51c842a0,work_dir =   .  ";
	static String text="科大讯飞，呵呵 我的测试程序为什么不可以呢？";
	String filename="text_to_speech_test.pcm";
	static String param = "vcn=xiaoyan, spd = 50, vol = 50";
	int ret=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTTs testts=new TestTTs();
	//	testts.initts();
	    testts.text_to_speech(text, param);
    
	}
	
	
	/*public void initts(){
		ret=cmn.MSPLogin(null, null, login_configs);
		if(ret!=Msp_errorsLibrary.MSP_SUCCESS){
			System.out.println("login faild.........");
		}
		
		System.out.println("login 成功"+ret);
		ret=cmn.MSPLogout();
		if(ret!=Msp_errorsLibrary.MSP_SUCCESS){
			System.out.println("logout faild.........");
		}
	}*/
	
	public  int text_to_speech(String text,String paramters){
		
		String sess_id = null;
		int ret = -1;
		int text_len = 0;
		//char* audio_data = NULL;
		IntByReference audio_len = new IntByReference(0);
		IntByReference synthStatus = new IntByReference(0);
		
		int synth_status = Msp_typeLibrary.MSP_TTS_FLAG_STILL_HAVE_DATA;
		IntByReference result =new IntByReference();
		text_len=text.getBytes().length;
		byte[] src_text={};
		ret=cmn.MSPLogin(null, null, login_configs);
		if(ret!=Msp_errorsLibrary.MSP_SUCCESS){
			System.out.println("login faild.........");
		}
		
		/*try {
			src_text=new String(text.getBytes(),"GB2312");
			
		} catch (UnsupportedEncodingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}*/
		
		
			try {
				src_text=text.getBytes("GB2312");
			} catch (UnsupportedEncodingException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		
		sess_id=tts.QTTSSessionBegin(paramters, result);
		if(result.getValue()!=Msp_errorsLibrary.MSP_SUCCESS){
			System.out.println("sessionbegin 失败");
		}
		
		ret=tts.QTTSTextPut(sess_id, src_text, text_len, paramters);
		if(ret!=Msp_errorsLibrary.MSP_SUCCESS){
			System.out.println("textput 失败");
			tts.QTTSSessionEnd(sess_id, "TextPutError");
		}
		
		
		 Vector<InputStream> vector = new Vector<InputStream>();
		 AudioFormat af=new AudioFormat(16000,16,1,true,false);
		 int totaldatasize=0;
		while(true){
			Pointer data=tts.QTTSAudioGet(sess_id,audio_len , synthStatus, result);
			if(data!=null){
				byte [] audiodata=data.getByteArray(0, audio_len.getValue());
				InputStream inputs=new ByteArrayInputStream(audiodata);
				vector.add(inputs);

				 
			}
			totaldatasize+=audio_len.getValue();
			if(synthStatus.getValue()==Msp_typeLibrary.MSP_TTS_FLAG_DATA_END||result.getValue()!=0){
				break;
			}
		}
		System.out.println("总共的数据长度是："+totaldatasize +"信息"+tts.QTTSAudioInfo(sess_id));
		Enumeration<InputStream> e = vector.elements();  

		InputStream sis = new SequenceInputStream(e);  


		AudioInputStream ais=new AudioInputStream(sis,af,totaldatasize/2);
		
		try {
			AudioSystem.write(ais, AudioFileFormat.Type.WAVE,new File("E:/testtts.wav") );
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		ret=tts.QTTSSessionEnd(sess_id, null);
		
		ret=cmn.MSPLogout();
		if(ret!=Msp_errorsLibrary.MSP_SUCCESS){
			System.out.println("logout faild.........");
		}
		return ret;
	}
	
}
 