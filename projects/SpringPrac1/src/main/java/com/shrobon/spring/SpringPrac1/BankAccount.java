package com.shrobon.spring.SpringPrac1;

public class BankAccount {
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", branch=" + branch + ", bank=" + bank + "]";
	}

	private int accno;
	private String branch;
	private String bank;
}
