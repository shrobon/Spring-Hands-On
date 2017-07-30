package com.shrobon.spring.springjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		//context.register();// for adding more configurations 
		//Dao bean = context.getBean(Dao.class);
		//bean.create();
		
		Service service = context.getBean(Service.class);
		service.save();
		
		Service service1 = context.getBean(Service.class);
		service1.save();
		
		if(service.hashCode() == service1.hashCode()){
			System.out.println("Singleton");
		}else{
			System.out.println("Prototype");
		}
		
		
		((AnnotationConfigApplicationContext)context).close(); // to get destory 
	}

}
