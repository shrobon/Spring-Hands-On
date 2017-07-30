package com.shrobon.spring.SpringPrac1.hibernate.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shrobon.spring.SpringPrac1.hibernate.product.dao.ProductDao;
import com.shrobon.spring.SpringPrac1.hibernate.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shrobon/spring/SpringPrac1/hibernate/test/config.xml");
		ProductDao bean = (ProductDao) context.getBean("productDao");
		Product product = new Product();
		product.setId(1);
		product.setName("PixelXL");
		product.setDesc("The best phone ever");
		product.setPrice(1000);
		bean.create(product);
	}

}
