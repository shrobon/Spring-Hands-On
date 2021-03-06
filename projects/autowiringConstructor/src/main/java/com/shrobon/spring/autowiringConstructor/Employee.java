package com.shrobon.spring.autowiringConstructor;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private Address address;
	
	

	public Employee(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + getAddress() + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
