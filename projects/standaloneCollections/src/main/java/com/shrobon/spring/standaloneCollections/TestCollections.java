package com.shrobon.spring.standaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollections {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/shrobon/spring/standaloneCollections/config.xml");
		ProductsList bean = (ProductsList) ctx.getBean("productsList");
		System.out.println(bean);
	}
}
