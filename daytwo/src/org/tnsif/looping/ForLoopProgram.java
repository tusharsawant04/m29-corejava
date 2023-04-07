package org.tnsif.looping;

import java.util.Scanner;

public class ForLoopProgram {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the nummber");
		int N=s.nextInt();
		for(int i=0; i<=N; i++) {
			System.out.print(i+" ");
		}

	}

}
