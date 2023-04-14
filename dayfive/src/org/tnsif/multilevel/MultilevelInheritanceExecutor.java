package org.tnsif.multilevel;

public class MultilevelInheritanceExecutor  {
	
	public static void main(String args[]) {
		City c=new City();
		c.setCityName("mumbai");
		c.setArea("virar");
		c.setStateName("maharashtra");
		c.setLanguage("marathi");
		c.setCountryName("India");
		c.setCountryCapital("Delhi");
		
		System.out.println(c);
		
	}

}
