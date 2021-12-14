package testjacob;

import com.jacob.com.Variant;
import com.jacobgen.microsoft.sapi.ISpeechObjectToken;
import com.jacobgen.microsoft.sapi.ISpeechObjectTokens;
import com.jacobgen.microsoft.sapi.ISpeechVoice;
import com.jacobgen.microsoft.sapi.SpeechRunState;
import com.jacobgen.microsoft.sapi.SpeechVoiceSpeakFlags;

public class CopyOfTestSpeak {
	

	public static void main(String[] args) {
		//System.setProperty("com.jacob.debug","true");
		// TODO Auto-generated method stub
		ISpeechVoice sv=new ISpeechVoice("SAPI.SPVoice");
		ISpeechObjectTokens sots=sv.getVoices();
		int tokenssize=sots.getCount();
		System.out.println("�õ���tokens����"+tokenssize);
		for(int t=0;t<5;t++){
			ISpeechObjectToken sot=	sots.item(0);
			if(sot!=null){
				System.out.println("�õ���token��Ϊnull "+sot.getId()+"programid="+sot.getProgramId());
			}
			
				sv.setVoice(sot);
			
			
			int result=sv.speak("���д���´Ӷ�������¶ˮ������ȴ�ǵ���΢�٣�����һ������֮�У����г�Ů���˹�����¼ŵ����顣�ڶ���дŮ���˹�������ת���ļ��ڻ���������ϸ�������£�û�и������£���ʾ����������Ҫ���¶�˼��Զ�����ɷ򡣵�����дŮ���˹��ĵ����ж���ʵ�������������顣���������Ĺ�˼�����صı��ַ���<pitch middle = '-50'/>  nice to  meet you",SpeechVoiceSpeakFlags.SVSFIsXML|SpeechVoiceSpeakFlags.SVSFlagsAsync);
			System.out.println(result);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(sv.getStatus().getRunningState()==SpeechRunState.SRSEIsSpeaking){
				sv.speak("�������������¸�����", SpeechVoiceSpeakFlags.SVSFlagsAsync|SpeechVoiceSpeakFlags.SVSFPurgeBeforeSpeak);
			}
			//sv.speak("�������ָ���������ǡ�����һ����ת����Ĺ�Թʫ��д������ҹ�ٸ���Թ�顣");
			
		}
		
		System.out.println("�첽�������");
		try {
			Thread.sleep(2000);
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