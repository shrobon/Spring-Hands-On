package com.shrobon.spring.LifecycleAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@PostConstruct
	public void hi() {
		// This will act as our init method
		System.out.println("This is Inside hi !!");
	}

	@PreDestroy
	public void bye() {
		System.out.println("Inside bye !!");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	
}
