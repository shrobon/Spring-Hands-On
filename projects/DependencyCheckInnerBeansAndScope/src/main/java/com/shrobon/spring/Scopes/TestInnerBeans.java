package com.shrobon.spring.Scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInnerBeans {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/Scopes/spring.xml");
		Employee bean1 = (Employee) ctx.getBean("employee");
/*		System.out.println(bean1);
		System.out.println("hashCode for bean1 (singleton): "+bean1.hashCode());
		
		Employee bean2 = (Employee) ctx.getBean("employee");
		System.out.println(bean2);
		System.out.println("hashCode for bean2 (singleton): "+bean2.hashCode());*/
		
		/* For experimenting with prototype scope */
		System.out.println(bean1);
		System.out.println("hashCode for bean1 (prototype): "+bean1.hashCode());
		
		Employee bean2 = (Employee) ctx.getBean("employee");
		System.out.println(bean2);
		System.out.println("hashCode for bean2 (prototype): "+bean2.hashCode());
		/**/
	
	}
}
