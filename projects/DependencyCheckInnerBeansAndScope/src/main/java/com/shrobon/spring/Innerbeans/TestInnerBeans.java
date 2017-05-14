package com.shrobon.spring.Innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInnerBeans {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/Innerbeans/spring.xml");
		Employee bean = (Employee) ctx.getBean("employee");
		System.out.println(bean);
	
	}
}
