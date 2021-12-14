package testjacob;

import com.jacob.com.Variant;
import com.jacobgen.microsoft.sapi.ISpeechRecoContext;
import com.jacobgen.microsoft.sapi.ISpeechRecoGrammar;
import com.jacobgen.microsoft.sapi.ISpeechRecoResult;
import com.jacobgen.microsoft.sapi.ISpeechRecognizer;
import com.jacobgen.microsoft.sapi.SpeechLoadOption;
import com.jacobgen.microsoft.sapi.SpeechRecognitionType;
import com.jacobgen.microsoft.sapi.SpeechRuleState;
import com.jacobgen.microsoft.sapi._ISpeechRecoContextEvents;

public class TestRecognizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ISpeechRecognizer sreco=new ISpeechRecognizer("Sapi.SpSharedRecognizer");
		ISpeechRecoContext srecocontext=sreco.createRecoContext();
		System.out.println("识别上下文的状态是"+srecocontext.getState());
		srecocontext.setEventInterests(38);
		
		ISpeechRecoGrammar grammar=srecocontext.createGrammar();
		
		grammar.cmdLoadFromFile("E:/eclipse-standardworkspaces/testjacob/coffee.xml",SpeechLoadOption.SLOStatic);
		//grammar.cmdLoadFromResource(hModule, resourceName, resourceType, languageId);
		//grammar.cmdSetRuleState("VID_Navigation", SpeechRuleState.SGDSActive);
		grammar.setState(SpeechRuleState.SGDSActive);
		
		ISpeechRecoResult result=new  ISpeechRecoResult();
		
		Variant reblock=result.saveToMemory();
		
		result=srecocontext.createResultFromMemory(reblock);
		
		/*_ISpeechRecoContextEvents conevent=new _ISpeechRecoContextEvents("Sapi.SpSharedRecognizer");
		ISpeechRecoResult result=null;
		conevent.recognition(0, new Variant(0), SpeechRecognitionType.SRTStandard, result);*/
		String recoresult=result.getPhraseInfo().getText(0);
		
		System.out.println(recoresult);
		
	}

}
