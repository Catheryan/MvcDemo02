package com.demo.testmvc;

import android.content.Context;

public class RunModeModel extends EventDispatcher{
	private Context mContext;
	private String runMode;
	public RunModeModel(Context context) {
		this.mContext=context;
	}
	public String getAutoRunMode(){
		return "auto";
	}
	public String getHandRunMode(){
		return "hand";
	}
	public String getRunMode() {
		return runMode;
	}
	public void setRunMode(String runMode) {
		this.runMode = runMode;
	}
}
