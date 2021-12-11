package com.yanwang.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.spi.AudioFileReader;

import com.sun.jna.ptr.IntByReference;
import com.yanwang.iflyjava.Msp_cmnLibrary;
import com.yanwang.iflyjava.Msp_errorsLibrary;
import com.yanwang.iflyjava.Msp_typeLibrary;
import com.yanwang.iflyjava.QTTSLibrary;
import com.yanwang.iflyjava.QisrLibrary;

/**
 * @author wang
 *����ʹ��һ����Ƶ�ļ�������AudioInputStream������������ݵ�д���
 */
public class CopyOfTestISR {
	
    QisrLibrary isr=QisrLibrary.INSTANCE;
	
	QTTSLibrary tts=isr;
	
	Msp_cmnLibrary cmn=isr;
	
	String login_configs=" appid = 51c842a0,work_dir =   .  ";
	 String param = "sub=asr,aue=speex-wb,auf=audio/L16;rate=16000,ent=sms16k,rst=json,rse=utf8,ssm=1";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyOfTestISR testisr=new CopyOfTestISR();
		testisr.run_asr();

	}
	
	public void run_asr(){
		int ret;
		String testfilename="iflytek01.wav";
		String asrrrsult="result=";
		IntByReference result=new IntByReference();
		int audioStatus=Msp_typeLibrary.MSP_AUDIO_SAMPLE_FIRST;
		IntByReference epStatus=new IntByReference(Msp_typeLibrary.MSP_EP_LOOKING_FOR_SPEECH);
		
		IntByReference recStatus=new IntByReference(Msp_typeLibrary.MSP_REC_STATUS_SUCCESS);
		IntByReference errCode=new IntByReference(0);
		
		int datablocksize=6400;
		int realdatasize=datablocksize;
		int lastblocksize=12800;
		ret=cmn.MSPLogin(null, null, login_configs);
		if(ret!=Msp_errorsLibrary.MSP_SUCCESS){
			System.out.println("login faild.........");
		}
		
		File srcfile=new File(testfilename);
		
		AudioFileFormat aformat=null;
		AudioInputStream ais=null;
		try {
			aformat=AudioSystem.getAudioFileFormat(srcfile);
			ais=AudioSystem.getAudioInputStream(srcfile);
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int audiolength=aformat.getByteLength();
		System.out.println("��Ƶ�ļ����ܳ�����"+audiolength);
		byte[] audiodata=new byte[datablocksize];
		byte[] lastaudiodata=new byte[lastblocksize];
		
		String grammarid="e7eb1a443ee143d5e7ac52cb794810fe";
		
		String sessionid=isr.QISRSessionBegin(grammarid, param, errCode);
		if(errCode.getValue()!=Msp_errorsLibrary.MSP_SUCCESS){
			System.out.println("qisrseeionbegin failed");
		}
		boolean firstfill=true;
		int writedsize=0;
		while(true){
			
			if(firstfill){
				audioStatus=Msp_typeLibrary.MSP_AUDIO_SAMPLE_FIRST;
				
			}else{
				audioStatus=Msp_typeLibrary.MSP_AUDIO_SAMPLE_CONTINUE;
			}
		
	     	try {
	     		
	     		if(audiolength-writedsize>lastblocksize){
	     			int readedsize=ais.read(audiodata);
	     			writedsize+=readedsize;
	     		}else{
	     			System.out.println("��Ҫ�������һ��д��");
	     			int readedsize=ais.read(lastaudiodata);
	     			audiodata=lastaudiodata;
					realdatasize=readedsize;
					audioStatus=Msp_typeLibrary.MSP_AUDIO_SAMPLE_LAST;
	     		}
			
			    
			    
	 	     } catch (IOException e1) {
			// TODO Auto-generated catch block
			   e1.printStackTrace();
		      }
		
		
			ret=isr.QISRAudioWrite(sessionid, audiodata, realdatasize, audioStatus, epStatus, recStatus);
			firstfill=false;
			if(ret!=0){
				
				System.out.println("д�����");
				
			}
			//System.out.println("д���audiostatus="+audioStatus);
			System.out.println("ʶ���״̬��"+recStatus.getValue() );
			
			//System.out.println("write �ķ���ֵ"+ret);
		
			if (recStatus.getValue() == Msp_typeLibrary.MSP_REC_STATUS_SUCCESS) {
				String rslt = isr.QISRGetResult(sessionid, recStatus, 0, errCode);
				if (null != rslt){
					
						asrrrsult.concat(rslt);
					   try {
						System.out.println("1����̨�����Ϊ"+new String(rslt.getBytes("UTF-8")));
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			if(epStatus.getValue()==Msp_typeLibrary.MSP_EP_AFTER_SPEECH){
				System.out.println("������������β���˵�");
				break;
			}
			
		   	if(audioStatus==Msp_typeLibrary.MSP_AUDIO_SAMPLE_LAST){
		   		System.out.println("�ļ�д�����");
		   		break;
		   	}
			
	      try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
		ret=isr.QISRAudioWrite(sessionid, null, 0, Msp_typeLibrary.MSP_AUDIO_SAMPLE_LAST, epStatus, recStatus);
		if(ret!=0){
			
		}
		 System.out.println("2ʶ���״̬��"+recStatus.getValue() );	
		while (recStatus.getValue() != Msp_typeLibrary.MSP_REC_STATUS_COMPLETE && 0 == errCode.getValue()) {
			//.out.println("ʶ���״̬��"+recStatus.getValue() );
			//System.out.println("�˵����״̬"+epStatus.getValue()+"   errorcode"+errCode.getValue());
			String rslt =isr. QISRGetResult(sessionid, recStatus, 0, errCode);
			if(errCode.getValue()!=Msp_errorsLibrary.MSP_SUCCESS){
				System.out.println("�õ�ʶ�������󣡣���������������������");
			}
			if (null != rslt)
			{   
				
			System.out.println("2����̨�����Ϊ"+rslt);	
		    System.out.println("ʶ���״̬��"+recStatus.getValue() );	
		    System.out.println("�˵����״̬"+epStatus.getValue());
					
			  
				asrrrsult.concat(rslt);
			}
			
			  try {
					Thread.sleep(150);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		isr.QISRSessionEnd(sessionid, null);
		
		cmn.MSPLogout();
		
		System.out.println("���յ�ʶ������"+asrrrsult);
	
		
	}		

}
