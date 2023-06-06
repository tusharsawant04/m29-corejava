package org.tnsif.exceptiondemo;

public class FinnalyBlockExample {

	public static void main(String[] args) {
		//
		int arr[]=new int[] {101,33,78};
		
		System.out.println("Array is");
		try {
			System.out.println(arr[3]);
		}
     catch(Exception e){
    	 System.out.println("Exception handled"+e);
    	 /*1. when we call System.exit(0), it means no ant fruther
    	  * statement is executed
    	  */
    	 System.exit(0);
    //we can use multiple catch block	 
	
        }
		finally{
			/*2 when finally block contains exception code
			 * 
			 */
			System.out.println(13/0);
			System.out.println("Finallay block");
			
		}
	}

}
