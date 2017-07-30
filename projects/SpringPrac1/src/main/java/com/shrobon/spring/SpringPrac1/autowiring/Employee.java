package com.shrobon.spring.SpringPrac1.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	
	@Autowired
	@Qualifier("add1")
	public void setAddress(Address address) {
		this.address = address;
	}
	private String name;
	private Address address;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	
}
