package org.tnsif.decisionmaking;
import java.util.*;
public class IfElseProgram {

	public static void main(String[] args) {
		
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age and weight of a"+"donor");
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>18 && weight>50) {
			System.out.println("Eligible to donate the blood");
			
		}
		else {
			System.out.println("not Eligible to donate the blood");
		}

	}

}
