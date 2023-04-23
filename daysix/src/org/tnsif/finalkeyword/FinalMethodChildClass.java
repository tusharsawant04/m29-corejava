package org.tnsif.finalkeyword;

public class FinalMethodChildClass extends FinalMethod{

	final int num=275;
	
	//final method
	/*final method cannot be override
	final void show() {
		System.out.println("salary is"+salary);
	}
	*/
	final void show(int num) {
		System.out.println("salary is:"+num);
	}
	
}
