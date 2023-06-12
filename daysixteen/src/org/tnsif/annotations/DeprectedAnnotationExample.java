package org.tnsif.annotations;


public class DeprectedAnnotationExample {
	@Deprecated
	public void print() {
		System.out.println("welcome to java Anotation");
	}
	public static void main(String args[]) {
		DeprectedAnnotationExample d =new DeprectedAnnotationExample();
		d.print();
	}
}
