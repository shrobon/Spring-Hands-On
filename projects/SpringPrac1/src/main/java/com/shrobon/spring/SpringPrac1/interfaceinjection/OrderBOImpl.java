package com.shrobon.spring.SpringPrac1.interfaceinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("BO")
public class OrderBOImpl implements OrderBO {

	private OrderDAO dao;
	
	public OrderDAO getDao() {
		return dao;
	}

	@Autowired
	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public void placeOrder() {
		System.out.println("Inside OrderBO placeOrder()");
	}
	
	
	

}
