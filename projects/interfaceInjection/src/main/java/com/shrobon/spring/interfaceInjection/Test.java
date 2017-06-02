package com.shrobon.spring.interfaceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/interfaceInjection/config.xml");
		OrderBO bean = (OrderBO) ctx.getBean("bo");
	    bean.placeOrder();
	}

}
