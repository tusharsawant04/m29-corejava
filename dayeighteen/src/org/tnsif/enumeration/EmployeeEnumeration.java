package org.tnsif.enumeration;

public class EmployeeEnumeration {
	enum empType{
		CONTRACT,PERMANENT,PARTTIME
	}

	static void print(empType a) {
		if(a==empType.CONTRACT) {
			System.out.println("you are on contract based");
		}
		else if(a==empType.PERMANENT) {
			
		}
		else {
			System.out.println("part time employee");
		}
	}
	public static void main(String[] args) {
		empType a=empType.PERMANENT;
		print(a);

	}

}
