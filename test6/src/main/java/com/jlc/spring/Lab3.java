package com.jlc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * using message bundles
 * Exception on not found
*/
public class Lab3 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Spring container ready");
		System.out.println("______________________");
		TestBean h = (TestBean)ctx.getBean("testBean");
		h.showEnglish();
		h.showHindi();
	}
}
