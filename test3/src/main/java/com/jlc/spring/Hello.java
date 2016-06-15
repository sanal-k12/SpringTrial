/**
 * 
 */
package com.jlc.spring;

/**
 * @author Sanal K
 *
 */
public class Hello {
	private A aobj;
	
	private B bobj;

	public void setBobj(B bobj) {
		System.out.println("hello-setBobj");
		this.bobj = bobj;
	}

	public void setAobj(A aobj) {
		System.out.println("hello-setAobj");
		this.aobj = aobj;
	}
	
	public void show() {
		System.out.println("Hello-show()");
		aobj.showA();
		bobj.showB();
	}

}
