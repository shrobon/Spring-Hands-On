package com.shrobon.spring.beanexternalization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/beanexternalization/spring.xml");
		MyDAO bean = (MyDAO) ctx.getBean("mydao");
		System.out.println(bean);
	}

}
