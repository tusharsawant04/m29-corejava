package org.tnsif.hierachicalinheritance;
//parent class
public class Android {

	
	private String brand;
	private String ownerName;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOwerName() {
		return ownerName;
	}
	public void setOwerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public Android() {
		
		
		System.out.println("Default constructor for parent");
		brand="Realme";
		ownerName="li BingZhong ";
	}
	public Android(String brand, String ownerName) {
		super();
		this.brand = brand;
		this.ownerName = ownerName;
	}
	
	
}
