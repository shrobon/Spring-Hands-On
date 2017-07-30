package com.shrobon.spring.SpringPrac1.interfaceinjection;

import org.springframework.stereotype.Component;

@Component
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAO createOrder()");
	}

}
