package org.insif.superkeyword;

public class Animal {
	
	public String animalType="wild";
	public int noOfLegs=2;
	
	public void display()
	{
		System.out.println("Animal Type:"+animalType);
		System.out.println("NO of legs:"+noOfLegs);
	}

	@Override
	public String toString() {
		return "Animal [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}
	
	

	
}
