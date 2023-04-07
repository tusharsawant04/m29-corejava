package org.tnsif.looping;

public class NestedForLoopProgram {

	public static void main(String[] args) {
		int rows=4, columns=4;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++){
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

}
