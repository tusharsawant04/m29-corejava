package org.tnsif.statickeyworddemo;
//program to demonstare on static block and static method
public class Customer {
	//non static data member
	private int custId;
	//static data member
	private static String companyName;
	//static block
	static
	{
		//we cannot use non static variable inside satutc bloc
		companyName="Myntra";
		
	}
	public Customer() {
	System.out.println("Default constructor");
	custId++;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId +"]";
	}
	
	static void display() {
		System.out.println("Companyname"+companyName);
	}
	

}
