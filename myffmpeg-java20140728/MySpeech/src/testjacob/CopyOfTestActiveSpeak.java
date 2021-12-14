package testjacob;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
import com.jacobgen.microsoft.sapi.ISpeechObjectToken;

public class CopyOfTestActiveSpeak {
	public static void main(String[] args) {
		ActiveXComponent ac=new ActiveXComponent("SAPI.SPVoice");
		//ActiveXComponent ac=new ActiveXComponent("speech.SPVoice");
		Dispatch spd= ac.getObject();
		Dispatch voices=Dispatch.call(spd, "GetVoices").toDispatch();
		//Dispatch voice=Dispatch.call(spd, "GetVoice").toDispatch();
		int counts=Dispatch.get(voices, "Count").changeType(Variant.VariantInt).getInt();
		System.out.println(counts);
		for(int c=1;c<counts;c++){
			ISpeechObjectToken token=new ISpeechObjectToken(Dispatch.call(voices, "Item", new Variant(c)).toDispatch());
			System.out.println(Dispatch.call(token, "GetDescription").toString());
			
			//Dispatch.call(spd, "setVoice", Dispatch.call(voices, "Item", new Variant(c)).toDispatch());
		//	Dispatch.call(spd, "setVoice", token.createInstance());
			System.out.println("programid="+token.getProgramId());
			//Dispatch.put(spd, "voice",	token.createInstance());
			Dispatch.put(spd, "Voice", token.createInstance().toJavaObject());
			Dispatch.call(spd, "Speak", "×ª»»ÓïÒô³É¹¦ hello word");
		}
	}
	

}
