package org.tnsif.assignment1;
import java.util.Scanner;
public class AddTwoNumberFunction {
	
	public static int addTwoNumber(int a, int b) {
		int sum=a+b;
		return sum;
		
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter two number for addition");
		int a=s.nextInt();
		int b=s.nextInt();
		
    
    System.out.println(addTwoNumber(a,b));
    
    
    
	}

}
