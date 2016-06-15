package com.jlc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * @Autowired default way of search is byType if two beans of same type it gives exception.
 * Used for both fields and constructor
 * @Qualifier("name") used with it for byName process of wiring used with both field and constructor
 * "required" attr of @Autowired makes the prop wiring req at contr startup
 * @Required anno used for same but for <autowire>
*/
public class Lab3 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Spring container ready");
		System.out.println("______________________");
		Hello h = (Hello)ctx.getBean("hello");
		h.show();
	}
}
