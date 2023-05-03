package org.tnsif.arrays;

public class ArrayObjectDemo {

	public static void main(String[] args) {
	//array of customer class
		
		Customer[] arr=new Customer[2];
		arr[0]=new Customer(2345,"tushar");
		arr[1]=new Customer(5678,"mihir");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getId()+" "+arr[i].getName());
			
		}
	}

}
