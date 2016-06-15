package com.jlc.spring;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class TestBean {
	
	@Autowired
	ApplicationContext ctx;
	
	void showEnglish(){
		String m1 = ctx.getMessage("username.required", null, null);
		System.out.println(m1);
		String m2 = ctx.getMessage("password.required", new Object[]{"password"}, null);
		System.out.println(m2);
		String m3 = ctx.getMessage("errors.min", new Object[]{"Username","5"}, null);
		System.out.println(m3);
		String m4 = ctx.getMessage("errors.max", new Object[]{"Username","10"}, null);
		System.out.println(m4);
		String m5 = ctx.getMessage("errors.range", new Object[]{"password","6","10"}, null);
		System.out.println(m5);
		//String m6 = ctx.getMessage("errors.range1", new Object[]{"password","6","10"}, null);
		//System.out.println(m6);
	}
	
	void showHindi(){
		String m1 = ctx.getMessage("username.required", null, new Locale("hi"));
		System.out.println(m1);
		String m2 = ctx.getMessage("password.required", new Object[]{"password"}, new Locale("hi"));
		System.out.println(m2);
		String m3 = ctx.getMessage("errors.min", new Object[]{"Username","5"}, new Locale("hi"));
		System.out.println(m3);
		String m4 = ctx.getMessage("errors.max", new Object[]{"Username","10"}, new Locale("hi"));
		System.out.println(m4);
		String m5 = ctx.getMessage("errors.range", new Object[]{"password","6","10"}, new Locale("hi"));
		System.out.println(m5);
		//String m6 = ctx.getMessage("error.range1", new Object[]{"password","6","10"}, new Locale("hi"));
		//System.out.println(m6);
	}
}
