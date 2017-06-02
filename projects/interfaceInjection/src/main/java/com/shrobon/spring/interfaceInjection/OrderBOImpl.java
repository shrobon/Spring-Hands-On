package com.shrobon.spring.interfaceInjection;

public class OrderBOImpl implements OrderBO {

	private OrderDAO dao; 
	
	
	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside OrderBO");
		dao.createOrder();
	}
	public OrderDAO getDao() {
		return dao;
	}
	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
