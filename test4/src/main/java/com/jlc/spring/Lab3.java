package com.jlc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * constructor <autowire> uses byname to resolve conflict if not resolve it will not wire the beans
 * if resolve partial and llr  argument consr not present than no load
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
