package org.tnsif.exceptiondemo;
import java.io.IOException;
public class ThrowKeywordExample {

	public static void donate(int age, int weight)throws IOException {
		if(age<18 && weight>50)
			System.out.println("Person is eligible to donate the blood");
			else
				throw new IOException("not Eligible");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
				ThrowKeywordExample.donate(19,45);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

	}

}
