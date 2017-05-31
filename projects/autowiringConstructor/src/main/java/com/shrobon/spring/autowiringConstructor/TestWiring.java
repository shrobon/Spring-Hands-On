package com.shrobon.spring.autowiringConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWiring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/autowiringConstructor/spring.xml");
		Employee bean = (Employee) ctx.getBean("employee");
		System.out.println(bean);
	}
}
