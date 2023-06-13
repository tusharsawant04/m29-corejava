package org.tnsif.regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternClass {

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter input string: ");
	String input=s.nextLine();
	String pattern="hey there, i am using Regular expression";
	boolean result=Pattern.matches(pattern,input);
	System.out.println(result);

	}

}
