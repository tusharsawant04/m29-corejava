package org.tnsif.secondpackage;


import org.tnsif.firstpackage.*;
public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base b1 =new Base();
				/*
				 * if any method  is default we cannot acess into another package ,
				 *  we can access only inside the same package
             */
		
		//b1.methodDefault()
		b1.methodPublic();
	}

}
