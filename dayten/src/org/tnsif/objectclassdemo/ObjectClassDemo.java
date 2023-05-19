package org.tnsif.objectclassdemo;


class Sample{
	
}

class Demo{
	
	Demo(){
	   System.out.println("Inside constructor");	
	}
	
	protected void finalize() {
		System.out.println("In Finalize method");
	}
}







public class ObjectClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample s=new Sample();
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		
		
		Demo d =new Demo();
		
		System.out.println(d.getClass());
		System.out.println(d.hashCode());
		
		Object o =new Object();
		System.out.println(o.getClass());
	}

}
