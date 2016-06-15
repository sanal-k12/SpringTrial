package com.jlc.spring;

import org.springframework.context.ApplicationEvent;

public class WorkshopEvent extends ApplicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5436337421247659449L;
	Workshop ws;

	public WorkshopEvent(Object source, Workshop ws) {
		super(source);
		this.ws = ws;
	}

	public Workshop getWs() {
		return ws;
	}

}
