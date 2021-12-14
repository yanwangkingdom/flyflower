package testjacob;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
import com.jacobgen.microsoft.sapi.ISpeechObjectToken;
import com.jacobgen.microsoft.sapi.ISpeechObjectTokens;

public class TestActiveSpeak {
	public static void main(String[] args) {
		//ActiveXComponent ac=new ActiveXComponent("SAPI.SPVoice");
		Dispatch spd= new Dispatch("SAPI.SPVoice");
		//ISpeechObjectTokens voices=new ISpeechObjectTokens(Dispatch.call(spd, "GetVoices").toDispatch());
		Dispatch voices=Dispatch.call(spd, "GetVoices").toDispatch();
		//Dispatch voice=Dispatch.call(spd, "GetVoice").toDispatch();
		int counts=Dispatch.get(voices, "Count").changeType(Variant.VariantInt).getInt();
		System.out.println(counts);
		for(int c=0;c<counts;c++){
			Dispatch token=(Dispatch.call(voices, "Item", new Variant(c)).toDispatch());
			System.out.println(Dispatch.call(token, "GetDescription").toString());
		//	ISpeechObjectToken defaultvoice= new ISpeechObjectToken(spd.getProperty("Voice").toDispatch());
			//Dispatch.call(spd, "setVoice", Dispatch.call(voices, "Item", new Variant(c)).toDispatch());
		//	Dispatch.call(spd, "setVoice", token.createInstance());
			//System.out.println("defaultvoice="+defaultvoice.getDescription());
			Dispatch.putRef(spd, "voice",	token);
			//ac.setProperty("Voice", token);
			Dispatch.call(spd, "Speak", "×ª»»ÓïÒô³É¹¦ hello word");
		}
	}
	

}
