package com.shrobon.spring.SpringPrac1;

public class Salary {
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	private int base;
	private int tax;
	private int hra;
	
	
	@Override
	public String toString() {
		return "Salary [base=" + base + ", tax=" + tax + ", hra=" + hra + "]";
	}
	
	
}
