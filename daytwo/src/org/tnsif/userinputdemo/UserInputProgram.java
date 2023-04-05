package org.tnsif.userinputdemo;
import java.util.*;
public class UserInputProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your name");
		String name=s.next();
		s.nextLine();
		System.out.println("Enter your name1");
		String name1=s.nextLine();
		System.out.println("enter character");
		char ch=s.next().charAt(0);
		System.out.println("Enter your salary");
		float salary=s.nextFloat();
		System.out.println("salary is: "+salary);
		System.out.println("name: "+name);
		System.out.println("name1: "+name1);
		System.out.println("character is : "+ch);
		
		
		s.close();
	}

}
