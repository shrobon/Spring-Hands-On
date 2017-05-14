package com.shrobon.spring.CInjectionAmbiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAmbiguity {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/CInjectionAmbiguity/spring.xml");
		Addition bean = (Addition) ctx.getBean("addition");
	}

}
