package org.tnsif.exceptiondemo;

import java.util.Scanner;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {	
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
    	System.out.println(2+3);
	}

}
