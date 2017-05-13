package com.shrobon.spring.Asst4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCart {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShoppingCart bean = (ShoppingCart) ctx.getBean("cart");
		System.out.println(bean);
	}
}
