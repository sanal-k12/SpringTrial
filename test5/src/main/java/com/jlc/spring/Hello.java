/**
 * 
 */
package com.jlc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

/**
 * @author Sanal K
 *
 */
public class Hello {
	//@Autowired
	//@Qualifier("ao2")
	//@Autowired(required=true)
	//@Qualifier("ao2")
	//@Autowired
	private A aobj;
	
	//@Autowired(required=false)
	//@Autowired
	private B bobj;
	
	
	/*@Autowired
	public Hello(@Qualifier("ao2")A aobj, B bobj) {
		this.aobj = aobj;
		this.bobj = bobj;
	}*/


	@Required
	public void setAobj(A aobj) {
		System.out.println("Hello -setAobj ");
		this.aobj = aobj;
	}

	@Required
	public void setBobj(B bobj) {
		System.out.println("Hello -setBobj ");
		this.bobj = bobj;
	}


	public void show() {
		System.out.println("Hello-show()");
		aobj.showA();
		bobj.showB();
	}

}
