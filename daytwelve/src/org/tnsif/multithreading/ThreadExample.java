package org.tnsif.multithreading;

public class ThreadExample {

	public static void main(String[] args) {
		//Return a reference to the currently executing thread object
		Thread t=Thread.currentThread();
		System.out.println("current thred:"+t);
	}

}
