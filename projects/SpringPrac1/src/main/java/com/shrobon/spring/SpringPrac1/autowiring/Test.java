package com.shrobon.spring.SpringPrac1.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/SpringPrac1/autowiring/config.xml");
		Employee bean = (Employee) ctx.getBean("employee");
		System.out.println(bean);
	}

}
