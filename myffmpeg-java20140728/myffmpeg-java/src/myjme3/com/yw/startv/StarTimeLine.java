package com.yw.startv;

import com.jme3.cinematic.TimeLine;

public class StarTimeLine extends TimeLine{
	   public int getKeyFrameIndexFromTime(float time) {
	        return Math.round(time * (float)keyFramesPerSeconds);
	    }

}
