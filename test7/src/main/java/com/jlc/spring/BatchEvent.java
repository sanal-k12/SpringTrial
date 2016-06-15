package com.jlc.spring;

import org.springframework.context.ApplicationEvent;

public class BatchEvent extends ApplicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2228427234646233028L;
	Batch batch;
	public BatchEvent(Object source, Batch batch ) {
		super(source);
		this.batch = batch;
	}
	public Batch getBatch() {
		return batch;
	}
	
}
