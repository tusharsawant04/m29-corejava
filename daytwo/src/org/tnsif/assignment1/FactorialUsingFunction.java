package org.tnsif.assignment1;

import java.util.Scanner;

public class FactorialUsingFunction {

	static int factorial(int num) {
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact=i*fact;
		}
		
		return fact;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Number:");
		int num=s.nextInt();
		System.out.println("Factorial of a given number is:"+factorial(num));
		

	}

}
