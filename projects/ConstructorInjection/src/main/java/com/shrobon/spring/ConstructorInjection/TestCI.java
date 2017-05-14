package com.shrobon.spring.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/ConstructorInjection/spring.xml");
		Employee bean = (Employee) ctx.getBean("employee");
		System.out.println(bean);
	}
}
