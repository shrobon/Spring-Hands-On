package com.shrobon.spring.CollectionListHospital;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHospital {
	public static void main(String[] args) {
		
		//1. spring container is created
		//2. container loads the configurations into classpath
		//3. hospital bean gets created
		//4. Dependency Injection takes place
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
		Hospital bean = (Hospital) ctx.getBean("hospital");
		System.out.println(" Hospital name is : "+ bean.getName());
		System.out.println("Hospital Departments"+ bean.getDepartments().getClass());
	}
}
