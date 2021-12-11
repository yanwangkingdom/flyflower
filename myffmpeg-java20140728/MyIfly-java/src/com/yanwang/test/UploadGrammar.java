package com.yanwang.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.sun.jna.ptr.IntByReference;
import com.yanwang.iflyjava.Msp_cmnLibrary;
import com.yanwang.iflyjava.Msp_errorsLibrary;
import com.yanwang.iflyjava.QTTSLibrary;
import com.yanwang.iflyjava.QisrLibrary;

public class UploadGrammar {
	
	    QisrLibrary isr=QisrLibrary.INSTANCE;
		
		QTTSLibrary tts=isr;
		
		Msp_cmnLibrary cmn=isr;
		
	public static void main(String[] args) {
		UploadGrammar ug=new UploadGrammar();
		ug.upload();
	}
	
    public void upload(){
    	String login_configs=" appid = 51c842a0,work_dir =   .  ";
    	
    	int ret=cmn.MSPLogin(null, null, login_configs);
		if(ret!=Msp_errorsLibrary.MSP_SUCCESS){
			System.out.println("login faild.........");
		}
    	
    	File gf=new File("my_drink1.abnf");
		int filesize=(int)gf.length();
		if(filesize<10){
			throw new RuntimeException("加载语法文件失败"); 
		}
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(gf);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		byte[]grammardata=new byte[filesize];
		try {
			fis.read(grammardata, 0, filesize);
			fis.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		IntByReference errorcode=new IntByReference(0);
		
		String grammarid=cmn.MSPUploadData("yanwangdrink", grammardata, filesize, "dtt = abnf, sub = asr", errorcode);
		if(errorcode.getValue()!=Msp_errorsLibrary.MSP_SUCCESS){
			System.out.println("语法上载错误"+errorcode.getValue());
		}else{
			System.out.println(grammarid);
		}
		ret=cmn.MSPLogout();
		if(ret!=Msp_errorsLibrary.MSP_SUCCESS){
			System.out.println("logout faild.........");
		}
    }
}
