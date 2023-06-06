package com.tns.threading;

public class Demo {

	 public static void main(String[] args) {
		/* Person p=new Person();
		 p.setId(101);
		 p.setName("Tushar");
		 
		 ChildThread t1= new ChildThread(p);
		 ChildThread t2= new ChildThread(p);
		 */
		 Account account =new Account();
		 account.setId(101);
		 account.setName("Tushar");
		 account.setBalance(50000);
		 AccountThread t1=new AccountThread(account,12000);
		 AccountThread t2=new AccountThread(account,12000);
		 AccountThread t3=new AccountThread(account,12000);
		 AccountThread t4=new AccountThread(account,12000);
		 AccountThread t5=new AccountThread(account,12000);
		 
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 System.out.println(account);
	 }
}
