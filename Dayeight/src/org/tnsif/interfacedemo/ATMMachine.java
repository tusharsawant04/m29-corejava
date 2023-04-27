package org.tnsif.interfacedemo;

public interface ATMMachine {
	//varible inside an interface  are by default public static final
//so here amount is final type and it must be intialize
	//int amount;
	// by default all the methods inside 
	//an interface are public abstract
	int amountWithdraw=1250;
	int amountDeposit=2000;
	void withdraw();
	void deposit();
	

}
