package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExceptionExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		String password=s.nextLine();
		try {
		if(id.equals("tsawant379@gmail.com")&& password.equals("pass@123")) {
			System.out.println("Credentials matched");
		}
		else {
			throw new LoginCredential("Invalid Credentials");
		}
		}
		catch(LoginCredential e) {
			System.out.println("Exception handled"+e);
			
		}
	}

}
