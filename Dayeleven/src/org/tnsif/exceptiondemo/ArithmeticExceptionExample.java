package org.tnsif.exceptiondemo;

import java.util.Scanner;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s = new Scanner(System.in);
     System.out.println("enter the value for x and y");
     int x=s.nextInt();
     int y=s.nextInt();
     
     
     try {
    	 System.out.println(x/y);
     }
     catch(Exception e) {
        System.out.println("Exception Handled");    	 
     }
     finally {
    	 System.out.println("finally block always executed");
     }
	}

}
