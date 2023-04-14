package org.tnsif.singleinheritance;

public class Student extends Citizen {

	private int rollno;
	private String college;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameteized constructor
	public Student(String name, String adharNo, String city, long contactNo,int rollno,String college) {
		super(name, adharNo, city, contactNo);
		this.rollno = rollno;
		this.college = college;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", college=" + college + ", getName()=" + getName() + ", getAdharNo()="
				+ getAdharNo() + ", getCity()=" + getCity() + ", getContactNo()=" + getContactNo() + "]";
	}
	
	
	
	
}
