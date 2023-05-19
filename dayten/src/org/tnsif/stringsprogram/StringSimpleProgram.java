package org.tnsif.stringsprogram;

public class StringSimpleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using string literal 
		String str1="tushar";
		System.out.println("Using string litraral: "+str1);
		
		//using new keyword
		String str2=new String("tushar");
		System.out.println("using new keyword: "+str2);
		
		/*when the string is created by using new keyword and 
		 * both the string  are same it will create a memory for that 
		 * string and hence using == we will get it as different (false)
		 */
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
	}

}
