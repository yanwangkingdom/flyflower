package testjacob;

import com.jacob.com.Variant;
import com.jacobgen.microsoft.sapi.ISpeechObjectToken;
import com.jacobgen.microsoft.sapi.ISpeechObjectTokens;
import com.jacobgen.microsoft.sapi.ISpeechVoice;
import com.jacobgen.microsoft.sapi.SpeechVoiceSpeakFlags;

public class TestSpeak {
	

	public static void main(String[] args) {
		//System.setProperty("com.jacob.debug","true");
		// TODO Auto-generated method stub
		ISpeechVoice sv=new ISpeechVoice("SAPI.SPVoice");
		ISpeechObjectTokens sots=sv.getVoices();
		int tokenssize=sots.getCount();
		System.out.println("�õ���tokens����"+tokenssize);
		for(int t=0;t<1;t++){
			ISpeechObjectToken sot=	sots.item(t);
			if(sot!=null){
				System.out.println("�õ���token��Ϊnull "+sot.getId()+"programid="+sot.getProgramId());
			}
			
				sv.setVoice(sot);
			
			
			sv.speak("�������� ������ ��������  nice to  meet you",SpeechVoiceSpeakFlags.SVSFlagsAsync);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("�첽�������");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*sv.setRate(3);
		for(int i=0;i<1;i++){
			sv.speak("�������� ������ �������� ");
		}*/
		//sv.speak("�������ָ���������ǡ�����һ����ת����Ĺ�Թʫ��д������ҹ�ٸ���Թ�顣���д���´Ӷ�������¶ˮ������ȴ�ǵ���΢�٣�����һ������֮�У����г�Ů���˹�����¼ŵ����顣�ڶ���дŮ���˹�������ת���ļ��ڻ���������ϸ�������£�û�и������£���ʾ����������Ҫ���¶�˼��Զ�����ɷ򡣵�����дŮ���˹��ĵ����ж���ʵ�������������顣���������Ĺ�˼�����صı��ַ�����ͨ��Ů���˹���������չʾ�������ؿշ��İ�Թ");
		//sv.speak("<pitch middle = '-50'/>�ҽ�����50 <pitch middle = '100'/>��������100", SpeechVoiceSpeakFlags.SVSFIsXML);
		
	}

}