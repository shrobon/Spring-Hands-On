package com.shrobon.spring.SpringPrac1.interfaceinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext   ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/SpringPrac1/interfaceinjection/config.xml");
		OrderBOImpl bean = (OrderBOImpl) ctx.getBean("BO");
		bean.placeOrder();
	}

}
