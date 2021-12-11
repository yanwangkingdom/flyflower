package com.yw.test;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;
   
public class AudioMixer_java {
	 Mixer audiomixer;
	 private AudioFormat audio_format;
     private SourceDataLine.Info line_info;
     SourceDataLine audio_line=null;
     int bufferbytesize=2048*4*2;
	public AudioMixer_java() {
		Mixer.Info mixinfo = AudioSystem.getMixerInfo()[0];
		audiomixer=AudioSystem.getMixer( mixinfo );
		audio_format = new AudioFormat( 44100, 16, 2, true, false );
		line_info = new DataLine.Info( SourceDataLine.class, audio_format, bufferbytesize );
		try {
			audio_line = ( SourceDataLine ) audiomixer.getLine( line_info );
			audio_line.open( audio_format, bufferbytesize );
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
	}
		
		    audio_line.start();
	
		
	}
	public void playAudio(byte[] audiodata){
		
		
		
			audio_line.write( audiodata, 0, audiodata.length );
		
	
	}
	
	
	public void closeaudio(){
		audio_line.drain();
		audio_line.close();
	}
}

