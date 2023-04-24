package org.tnsif.methodoverloading;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
	MethodOverloadingExample ml =new MethodOverloadingExample();
	System.out.println(ml.multiplication(12.5f, 3.0f));
	System.out.println(ml.multiplication(1.5f, 4));
	System.out.println(ml.multiplication(4, 2.5f));
	System.out.println(ml.multiplication(4, 8));
	System.out.println(ml.print("welcome to c2tc"));
	System.out.println(ml.print("tushar", "sawant"));

	}

}
