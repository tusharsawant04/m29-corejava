package org.tnsif.application;
import org.tnsif.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNO, String accNm, float accBal, float creditLimit) {
		super(accNO, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + "]";
	}

	
	

}
