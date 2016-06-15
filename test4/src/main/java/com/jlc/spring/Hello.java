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
	
	public Hello() {
		System.out.println("hello -arg Hello()");
	}

	/*public Hello(B bobj) {
		System.out.println("hello -arg Hello(B bobj) ");
		this.bobj = bobj;
	}*/

	public Hello(A aobj) {
		System.out.println("hello -arg Hello(A aobj)");
		this.aobj = aobj;
	}

	public Hello(A aobj, B bobj) {
		System.out.println("hello -arg Hello(A aobj, B bobj)");
		this.aobj = aobj;
		this.bobj = bobj;
	}

	public void show() {
		System.out.println("Hello-show()");
		
		bobj.showB();
		aobj.showA();
	}

}
