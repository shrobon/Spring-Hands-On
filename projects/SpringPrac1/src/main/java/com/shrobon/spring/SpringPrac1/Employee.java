package com.shrobon.spring.SpringPrac1;

import java.util.ArrayList;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;

public class Employee implements InitializingBean, DisposableBean {

	private int id;
	private String name;
	private ArrayList<String> dependents;
	private Address address;
	private String company;

	private Database db;

	public Database getDb() {
		return db;
	}

	public void setDb(Database db) {
		this.db = db;
	}

	public Salary getCompensation() {
		return compensation;
	}

	public void setCompensation(Salary compensation) {
		this.compensation = compensation;
	}

	private Salary compensation;

	public Employee(Salary salary) {
		this.compensation = salary;
	}

	public BankAccount getAccount() {
		return account;
	}

	@Required
	public void setAccount(BankAccount account) {
		this.account = account;
	}

	private BankAccount account;

	public String getCompany() {
		return company;
	}

	@Required
	public void setCompany(String company) {
		this.company = company;
	}

	// public void init(){
	// System.out.println("The init method has been invoked");
	// }
	//
	// public void destroy(){
	// System.out.println("The destroy method has been invoked");
	// }

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<String> getDependents() {
		return dependents;
	}

	public void setDependents(ArrayList<String> dependents) {
		this.dependents = dependents;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is another way to have init methods");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("This is another way of having destroy methods");
	}

}
