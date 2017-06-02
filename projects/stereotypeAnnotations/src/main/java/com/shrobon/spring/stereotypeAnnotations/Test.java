package com.shrobon.spring.stereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/stereotypeAnnotations/config.xml");
		Instructor instructor = (Instructor) ctx.getBean("instructor");
		System.out.println(instructor);
		
		Instructor instructor2 = (Instructor) ctx.getBean("instructor");
		System.out.println(instructor2);

	}

}
