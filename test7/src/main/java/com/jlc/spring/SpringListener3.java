package com.jlc.spring;

import org.springframework.context.ApplicationListener;

public class SpringListener3 implements ApplicationListener<BatchEvent> {

	@Override
	public void onApplicationEvent(BatchEvent event) {
		System.out.println("SpringListener3 - onApplicationEvent");
		System.out.println("BatchEvent raised");
		System.out.println(event.getBatch());

	}

}
