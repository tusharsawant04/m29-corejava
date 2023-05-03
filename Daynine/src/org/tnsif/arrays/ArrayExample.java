package org.tnsif.arrays;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		System.out.println("enter the no of element");
		Scanner s =new Scanner(System.in);
		int num=s.nextInt();
		int arr[]=new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i]=s.nextInt();
		}

		
		for(int i:arr) {
			System.out.println(" "+i);
		}
	}

}
