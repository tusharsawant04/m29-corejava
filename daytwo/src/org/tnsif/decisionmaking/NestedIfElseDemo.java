package org.tnsif.decisionmaking;
import java.util.*;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check its zero or not");
		int num=s.nextInt();
		
		if(num>0) {
			
			if(num<0) {
				System.out.println("Non-zero number");
			}else {
				System.out.println("Zero");
			}
		}
		else {
			System.out.println("number is either zero or not");
		}
	}

}
