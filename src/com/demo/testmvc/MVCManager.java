package com.demo.testmvc;

import android.content.Context;

public class MVCManager extends EventDispatcher {
	RunModeModel runModeModel;
	Context mContext;
	public MVCManager(Context mContext) {
		this.mContext=mContext;
		runModeModel =new RunModeModel(mContext);
	}
	public void getDefaultRunMode(){
		runModeModel.getAutoRunMode();
		runModeModel.handleChooseEvent(Events.AUTO, Events.AUTOSTR);
	}
	public void changeRunMode(int bean,String msg) {
		runModeModel.handleChooseEvent(bean,msg);
	}
	public void setRunMode(String runMode) {
		runModeModel.setRunMode(runMode);
	}
	public String getRunModeModel() {
		return runModeModel.getRunMode();
	}
}
