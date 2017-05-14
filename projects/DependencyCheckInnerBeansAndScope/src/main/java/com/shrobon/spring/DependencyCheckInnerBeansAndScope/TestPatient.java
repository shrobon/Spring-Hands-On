package com.shrobon.spring.DependencyCheckInnerBeansAndScope;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPatient {
	
	public static void main(String[] args) {
		//creating the IOC container
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/DependencyCheckInnerBeansAndScope/spring.xml");
		Prescription bean = (Prescription) ctx.getBean("prescription");
		System.out.println(bean);
		ctx.registerShutdownHook();
	}
	
}
