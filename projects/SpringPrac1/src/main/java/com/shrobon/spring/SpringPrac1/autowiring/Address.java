package com.shrobon.spring.SpringPrac1.autowiring;

public class Address {
	
	
	private String unit;
	private String street;
	private String zip;
	
	
	
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [unit=" + unit + ", street=" + street + ", zip=" + zip + "]";
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
}
