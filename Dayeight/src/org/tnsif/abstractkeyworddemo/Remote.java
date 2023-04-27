package org.tnsif.abstractkeyworddemo;
//if any class contains atleast one abstract one method
//then that class must be declare as abstract class
public abstract class Remote {
	String cellName;
	abstract void functionRemote();
	abstract void create();
	//abstract class anotain abstract and non abstract method
	void display() {
		System.out.println("Cell name is"+cellName);
	}
}
//implementable class
class RemoteChild extends Remote{
	
	@Override
	void functionRemote() {
		System.out.println("");
	}

	@Override
	void create() {
		System.out.println("Abstract method-2");
		
	}
}
