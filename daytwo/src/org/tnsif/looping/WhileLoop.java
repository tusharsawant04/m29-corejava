package org.tnsif.looping;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter a value of N");
		int n=s.nextInt();
		int i=0;	
		while(i<=n) {
			
			System.out.print(i+" ");
			i++;
		}
	}
}
