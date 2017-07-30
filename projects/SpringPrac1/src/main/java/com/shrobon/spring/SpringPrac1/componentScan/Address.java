package com.shrobon.spring.SpringPrac1.componentScan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Override
	public String toString() {
		return "Address [unit=" + unit + ", street=" + street + ", zip=" + zip + "]";
	}
	
	@Value("A5/7")
	private String unit;
	
	@Value("25 RC Ghosh lane")
	private String street;
	
	@Value("700039") 
	private int zip;
	
	
	
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
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
}
