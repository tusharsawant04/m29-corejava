package org.tnsif.multilevel;

public class Country {
	
	private String CountryName;
	private String countryCapital;
	
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public String getCountryCapital() {
		return countryCapital;
	}
	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}
	@Override
	public String toString() {
		return "Country [CountryName=" + CountryName + ", countryCapital=" + countryCapital + "]";
	}
	
	
	

}
