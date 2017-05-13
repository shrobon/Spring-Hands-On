package com.shrobon.spring.Lifecycle;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void hi() {
		// This will act as our init method
		System.out.println("This is Inside hi !!");
	}

	public void bye() {
		System.out.println("Inside bye !!");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
