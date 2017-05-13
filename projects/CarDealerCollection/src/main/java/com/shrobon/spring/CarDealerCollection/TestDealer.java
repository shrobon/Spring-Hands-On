package com.shrobon.spring.CarDealerCollection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
		CarDealer bean = (CarDealer) ctx.getBean("carDealer");
		System.out.println("Car Name is : "+ bean.getName());
		System.out.println("Car models are :"+ bean.getModels().getClass().getName());
	}

}
