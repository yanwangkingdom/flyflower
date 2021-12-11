package com.yanwang.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.spi.AudioFileReader;

import com.sun.jna.ptr.IntByReference;
import com.yanwang.iflyjava.Msp_cmnLibrary;
import com.yanwang.iflyjava.Msp_errorsLibrary;
import com.yanwang.iflyjava.Msp_typeLibrary;
import com.yanwang.iflyjava.QTTSLibrary;
import com.yanwang.iflyjava.QisrLibrary;

public class TestISR {
	
	 QisrLibrary isr=QisrLibrary.INSTANCE;
		
		QTTSLibrary tts=isr;
		
		Msp_cmnLibrary cmn=isr;
		
		String login_configs=" appid = 51c842a0,work_dir =   .  ";
		 String param = "sub=asr,aue=speex-wb,auf=audio/L16;rate=16000,ent=sms16k,rst=json,rse=utf8,ssm=1";
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			TestISR testisr=new TestISR();
			testisr.run_asr();

		}
		
		public void run_asr(){
			int ret;
			//String testfilename="iflytek01.wav";
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
			
			
			TargetDataLine targetdataline=null;
			AudioFormat auformat=new AudioFormat(16000,16,1,true,false);
			
			
			DataLine.Info info=new DataLine.Info(TargetDataLine.class,auformat);
			
			try {
				targetdataline=(TargetDataLine)AudioSystem.getLine(info);
				targetdataline.open();
				targetdataline.start();
	System.out.println("你可以说话了.........................");			
			} catch (LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		   int totaldatasize= targetdataline.available();
			
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
			
		     /*	try {
		     		
		     		if(audiolength-writedsize>lastblocksize){
		     			int readedsize=ais.read(audiodata);
		     			writedsize+=readedsize;
		     		}else{
		     			System.out.println("将要进行最后一次写入");
		     			int readedsize=ais.read(lastaudiodata);
		     			audiodata=lastaudiodata;
						realdatasize=readedsize;
						audioStatus=Msp_typeLibrary.MSP_AUDIO_SAMPLE_LAST;
		     		}
				
				    
				    
		 	     } catch (IOException e1) {
				// TODO Auto-generated catch block
				   e1.printStackTrace();
			      }
			      
			*/
			    if(targetdataline.available()>datablocksize){
			    	realdatasize=targetdataline.read(audiodata, 0, datablocksize);
			   System.out.println("我已经读入了"+realdatasize+"个字节了！！！！！！！"); 	
			    	
			    }else if(targetdataline.available()==0){
			    	System.out.println("本次麦克风没有数据");
			    	try {
						Thread.sleep(150);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	
			    	
			    }
			    
			    
			    
				ret=isr.QISRAudioWrite(sessionid, audiodata, realdatasize, audioStatus, epStatus, recStatus);
				firstfill=false;
				if(ret!=0){
					
					System.out.println("写入错误");
					
				}
				//System.out.println("写入后audiostatus="+audioStatus);
				System.out.println("识别的状态是"+recStatus.getValue() );
				System.out.println("端点检测的状态"+epStatus.getValue());
				//System.out.println("write 的返回值"+ret);
			
				if (recStatus.getValue() == Msp_typeLibrary.MSP_REC_STATUS_SUCCESS) {
					String rslt = isr.QISRGetResult(sessionid, recStatus, 0, errCode);
					if (null != rslt){
						
							asrrrsult.concat(rslt);
						   try {
							System.out.println("1控制台的输出为"+new String(rslt.getBytes("UTF-8")));
						} catch (UnsupportedEncodingException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				if(epStatus.getValue()==Msp_typeLibrary.MSP_EP_AFTER_SPEECH){
					System.out.println("发现了语音的尾部端点");
					break;
				}
				
			   	/*if(audioStatus==Msp_typeLibrary.MSP_AUDIO_SAMPLE_LAST){
			   		System.out.println("文件写入结束");
			   		break;
			   	}*/
				
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
			 System.out.println("2识别的状态是"+recStatus.getValue() );	
			while (recStatus.getValue() != Msp_typeLibrary.MSP_REC_STATUS_COMPLETE && 0 == errCode.getValue()) {
				//.out.println("识别的状态是"+recStatus.getValue() );
				//System.out.println("端点检测的状态"+epStatus.getValue()+"   errorcode"+errCode.getValue());
				String rslt =isr. QISRGetResult(sessionid, recStatus, 0, errCode);
				if(errCode.getValue()!=Msp_errorsLibrary.MSP_SUCCESS){
					System.out.println("得到识别结果错误！！！！！！！！！！！！");
				}
				if (null != rslt)
				{   
					
				System.out.println("2控制台的输出为"+rslt);	
			    System.out.println("识别的状态是"+recStatus.getValue() );	
			    System.out.println("端点检测的状态"+epStatus.getValue());
						
				  
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
			targetdataline.stop();
			targetdataline.close();
			cmn.MSPLogout();
			
			System.out.println("最终的识别结果是"+asrrrsult);
		
			
		}
		
		public void getAudioData(){
			
			TargetDataLine targetdataline=null;
			AudioFormat auformat=new AudioFormat(16000,16,1,true,false);
			
			
			DataLine.Info info=new DataLine.Info(TargetDataLine.class,auformat);
			
			try {
				targetdataline=(TargetDataLine)AudioSystem.getLine(info);
				targetdataline.open();
				targetdataline.start();
			} catch (LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		   int totaldatasize= targetdataline.available();
		   
		   
			
			
		}

	}
