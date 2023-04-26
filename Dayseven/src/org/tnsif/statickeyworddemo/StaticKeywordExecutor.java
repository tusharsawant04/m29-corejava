package org.tnsif.statickeyworddemo;

public class StaticKeywordExecutor {

	public static void main(String[] args) {
		
		//without creating the object we will get the value for 
		System.out.println(Employee.companyName);
		Employee e =new Employee(41,"tushar");
		
		System.out.println(e);
		Employee e1 =new Employee(41,"tushar");
		System.out.println(e1);
		
		Customer.display();
		
		Customer c=new Customer();
		System.out.println(c);
	}

}
