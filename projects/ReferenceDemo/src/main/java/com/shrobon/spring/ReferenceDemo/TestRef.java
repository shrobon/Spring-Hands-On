package com.shrobon.spring.ReferenceDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Student bean = (Student) ctx.getBean("student");
		
		System.out.println(bean);

	}

}
