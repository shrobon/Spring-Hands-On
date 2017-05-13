package com.shrobon.spring.SpringInterfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLC {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/SpringInterfaces/config.xml");
		Patient bean = (Patient) ctx.getBean("patient");
		System.out.println(bean);
		ctx.registerShutdownHook();
	}
}
