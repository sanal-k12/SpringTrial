package com.jlc.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class SpringListener1 implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof BatchEvent) {
			BatchEvent bevent = (BatchEvent)event;
			Batch bat = bevent.getBatch();
			System.out.println(bat);
		} else if (event instanceof WorkshopEvent) {
			WorkshopEvent wevent = (WorkshopEvent)event;
			Workshop ws = wevent.getWs();
			System.out.println(ws);
		} else {
			System.out.println(event);
		}		
	}

}
