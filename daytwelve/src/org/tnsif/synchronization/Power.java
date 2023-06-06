package org.tnsif.synchronization;

public class Power {

	
    synchronized void printPower(int num) {
		int x=1;
		for(int i=1;i<5; i++) {
			System.out.println(Thread.currentThread().getName()+num+"^"+i+"value:"+num*x);
			x=num*x;
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
