package com.shrobon.spring.SpringPrac1.componentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testComponents {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/SpringPrac1/componentScan/config.xml");
		Employee bean = (Employee) ctx.getBean("Emp");
		Employee bean1 = (Employee) ctx.getBean("Emp");
		
		if(bean.hashCode()==bean1.hashCode()){
			System.out.println("Scope is Singleton");
		}else{
			System.out.println("Scope is prototype");
		}

		System.out.println(bean);
	}

}
