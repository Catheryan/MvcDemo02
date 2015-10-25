package com.demo.testmvc;

public class EventDispatcher {
	private IEventListener listenr;

	public void addListener(IEventListener listenr) {
		this.listenr = listenr;
	}
	public void handleChooseEvent(int bean,String msg){
		listenr.onEvent(bean, msg);
	}
}
