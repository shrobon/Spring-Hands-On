package com.shrobon.spring.SpringPrac1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Address {
	
	@PostConstruct
	public void create(){
		System.out.println("Address Class Create Method");
	}
	
	@PreDestroy
	public void Destroy(){
		System.out.println("Address Class Destroy Method");
	}
	
	
	public String getFlat() {
		return flat;
	}
	public void setFlat(String flat) {
		this.flat = flat;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
	@Override
	public String toString() {
		return "Address [flat=" + flat + ", Street=" + Street + ", zip=" + zip + "]";
	}
	
	
	private String flat;
	private String Street;
	private int zip;
}
