package com.jlc.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * listener with out generic type fire for all standard spring events else they are custom
 * appCtx required to publish custom events
 * custom event obj must extend ApplicationEvent
 * custom eventlisteners must implement ApplicationListener<E>
*/
public class Lab3 {
	public static void main(String[] args) {
		//ConfigurableApplicationContext
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Spring container ready");
		System.out.println("______________________");
		ctx.start();
		SpringEventMgr h = (SpringEventMgr)ctx.getBean("jlc");
		Batch b = new Batch("B-24", "14-05-2016", "morning", "150");
		h.addBatch(b);
		Workshop w = new Workshop("Spring", 500, 99);
		h.addWorkshop(w);
		ctx.stop();
		ctx.close();
	}
}
