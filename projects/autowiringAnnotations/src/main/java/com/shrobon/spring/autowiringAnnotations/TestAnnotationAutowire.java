package com.shrobon.spring.autowiringAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationAutowire {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/autowiringAnnotations/spring.xml");
		Employee bean = (Employee) ctx.getBean("employee");
		System.out.println(bean);
	}
}
