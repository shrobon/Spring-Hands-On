package com.shrobon.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// The very first statement is to create a spring container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee bean = (Employee) ctx.getBean("emp");
		
		System.out.println("Employee ID: "+bean.getId());
		System.out.println("Employee name: "+bean.getName());

	}

}
