package org.tnsif.thiskeyworddemo;

public class ThisKeywordExample {

	private int cvvNo;
	private long atmNo;
	public ThisKeywordExample(int cvvNo, long atmNO) {
		super();
		//It can be used to return the current class instance
		
		this.cvvNo = cvvNo;
		this.atmNo = atmNO;
	}
	
	public void print() {
		System.out.println("CVV No:"+cvvNo+" "+"ATM CARD No"+atmNo);
	}
	
}
