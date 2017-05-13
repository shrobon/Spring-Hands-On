package com.shrobon.spring.SpringInterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{
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

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside Destroy !!");
		
	}

}
