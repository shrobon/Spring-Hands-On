package com.shrobon.spring.SpringPrac1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/shrobon/spring/SpringPrac1/config.xml");

		// registering a pre-shutdown hook
		// 1. change ApplicationContext -> AbstractApplicationContext
		ctx.registerShutdownHook();

		Employee bean = (Employee) ctx.getBean("emp");

		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println("My dependents are :" + bean.getDependents().toString());
		System.out.println(bean.getAddress());
		System.out.println("My company is :" + bean.getCompany());
		System.out.println("BANK INFO : " + bean.getAccount());
		System.out.println("SALARY INFO : "+bean.getCompensation());
		System.out.println("DATABASE INFO: " + bean.getDb());
		
//		Employee bean1 = (Employee) ctx.getBean("emp");
//
//		System.out.println(bean1.getId());
//		System.out.println(bean1.getName());
//		System.out.println("My dependents are :" + bean1.getDependents().toString());
//		System.out.println(bean1.getAddress());
//		System.out.println("My company is :" + bean1.getCompany());
//		System.out.println("BANK INFO : " + bean1.getAccount());
//		
//		if(bean.hashCode() == bean1.hashCode()){
//			System.out.println("SAME HASHCODE !! :: Scope = Singleton");
//		}else{
//			System.out.println("DIFFERENT HASHCODE !! :: Scope = Prototype");
//		}
	}
}
