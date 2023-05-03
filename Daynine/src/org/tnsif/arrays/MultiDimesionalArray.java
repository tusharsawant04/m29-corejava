package org.tnsif.arrays;

import java.util.Scanner;

public class MultiDimesionalArray {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
	int arr[][]=new int[2][3];
	
	for(int i=0;i<2;i++) {
		for(int j=0;j<3; j++) {
			arr[i][j]=s.nextInt();
		}	
	}
	for(int i=0; i<2;i++) {
		for(int j=0; j<3;j++) {
			System.out.println(arr[i][j]+" ");
		}
		System.out.println();
	}
	}

}

class Jaggedarray{
	//Dec
	int arr[][]=new int[2][];
	arr[0]=new int[3];
	arr[1]=new int[2]
	int count=0;
	for(int i=0; i<arr.length;i++)
		for(int j=0; j<arr[i].length;j++)
			arr[i][j]=count++;
	System.out.println()
}
