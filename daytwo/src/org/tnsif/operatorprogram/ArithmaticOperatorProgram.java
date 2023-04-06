package org.tnsif.operatorprogram;
import java.util.*;
public class ArithmaticOperatorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter The Value:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("The addition of two number: "+(x+y));
		System.out.println("The subtraction of two number: "+(x-y));
		System.out.println("The multiplication two number: "+(x*y));
		System.out.println("The Division of two number: "+(x/y));
       sc.close();
       }

}
