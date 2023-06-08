package org.tnsif.generics;

public class GenericClassExample<T> {

	T x;
	void print(T x)
	{
		this.x=x;
	}
	T accept() {
		return x;
	}
	public static void main(String[] args) {
		GenericClassExample<String>obj=new GenericClassExample<>();
		obj.print("Tushar");
		System.out.println(obj);

	}

}
