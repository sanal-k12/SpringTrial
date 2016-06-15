package com.jlc.spring;

import org.springframework.context.ApplicationListener;

public class SpringListener2 implements ApplicationListener<WorkshopEvent> {

	@Override
	public void onApplicationEvent(WorkshopEvent event) {
		System.out.println("SpringListener2 - onApplicationEvent");
		System.out.println("WorkshopEvent raised");
		System.out.println(event.getWs());
	}

}
