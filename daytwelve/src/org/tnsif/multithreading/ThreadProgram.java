package org.tnsif.multithreading;
//program ton demonstrate on creating a thread by 
//extending thread class
public class ThreadProgram extends Thread {
	
	public void run() {
		System.out.println("Thread is in running state");
	}
	public static void main(String[] args) {
		

		ThreadProgram t=new ThreadProgram();
		t.start();
		/* if thread is in the starting and running state, 
		 * we can't start again
		 */
		//t.start();
	}

}
