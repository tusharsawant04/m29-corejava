package org.tnsif.interfacedemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATMMachine a1 = new ATMMachineChild();
		a1.deposit();
		a1.withdraw();
		
		ReceipeImplementable r =new ReceipeImplementable();
		r.setName("tushar Sawant");
		System.out.println(r.displayName());

		
		NestedInterfaceExample n= new NestedInterfaceExample();
		n.setStr1("tushar");
		n.setStr2("sawant");
		System.out.println(n.concante());
	}

}
