package com.shrobon.spring.SpringPrac1.componentScan;

import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Emp")
@Scope("prototype")
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
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", subjects=" + subjects + "]";
	}
	
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Value("Shrobon Biswas")
	private String name;
	
	private Address address;
	
	@Value("#{topics}") // This is by using spring expression language 
	private LinkedList<String> subjects;

	public LinkedList<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(LinkedList<String> subjects) {
		this.subjects = subjects;
	}
}
