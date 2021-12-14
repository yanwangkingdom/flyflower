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
		System.out.println("得到的tokens个数"+tokenssize);
		for(int t=0;t<1;t++){
			ISpeechObjectToken sot=	sots.item(t);
			if(sot!=null){
				System.out.println("得到的token不为null "+sot.getId()+"programid="+sot.getProgramId());
			}
			
				sv.setVoice(sot);
			
			
			sv.speak("焉王万岁 ，万岁 ，万万岁  nice to  meet you",SpeechVoiceSpeakFlags.SVSFlagsAsync);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("异步调用完成");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*sv.setRate(3);
		for(int i=0;i<1;i++){
			sv.speak("焉王万岁 ，万岁 ，万万岁 ");
		}*/
		//sv.speak("此题属乐府《杂曲歌辞》，是一首宛转含蓄的闺怨诗，写初秋月夜少妇的怨情。起句写秋月从东方升起，露水虽生，却是淡薄微少，给人一种清凉之感，烘托出女主人公清冷孤寂的心情。第二句写女主人公在气候转凉的季节还穿着轻软细薄的罗衣，没有更换秋衣；暗示了因秋凉需要更衣而思念远方的丈夫。第三句写女主人公的弹筝行动，实际是以乐曲寄情。结句以巧妙的构思和奇特的表现方法，通过女主人公的心理活动，展示了她独守空房的哀怨");
		//sv.speak("<pitch middle = '-50'/>我降低了50 <pitch middle = '100'/>我升高了100", SpeechVoiceSpeakFlags.SVSFIsXML);
		
	}

}