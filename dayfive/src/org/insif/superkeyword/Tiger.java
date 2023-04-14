package org.insif.superkeyword;

public class Tiger extends Animal{
	public String animalType="tiger";
	public int noOfLegs=4;
	
	//default construstor
	public Tiger() {
		super();
		//invoking the parent class constructor
		//it calls parents class default constructor
		System.out.println("Tiger class constructor-child");
	}
	
	
	public void display()
	{
		
		super.display();
		System.out.println(super.animalType);
		System.out.println(super.noOfLegs);
		System.out.println("Animal Type:"+animalType);
		System.out.println("NO of legs:"+noOfLegs);
	}
	
	@Override
	public String toString() {
		return "Tiger [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}
	
}
