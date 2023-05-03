package org.tnsif.arrays;

public class ArraysDemo {

	
	public static void main(String[] args) {
		int arr[]= {12,6,90,67};
		/* if we access 4th index, we will get an exception 
		 * as "ArrayIndexOutofBoundException". as we are
		 * in the array
		 */
		System.out.println("Array of 2nd index is :"+arr[2]);
		//for printing all the element
		for(int i:arr) {
			System.out.println(i+" ");
		}
	}
}
