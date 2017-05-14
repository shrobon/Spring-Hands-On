package com.shrobon.spring.Assignment;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReservation {
	
	public static void main(String[] args) {
		//creating the IOC container
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		TicketReservation bean = (TicketReservation) ctx.getBean("reservation");
		System.out.println(bean.getTid());
		ctx.registerShutdownHook();
	}
	
}
