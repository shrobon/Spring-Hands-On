package com.shrobon.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/springjdbc/config.xml");
		JdbcTemplate bean = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		int result = bean.update(sql,new Integer(1),"Shrobon","Biswas");
		System.out.println("Number of records inserted are: " + result );
	}

}
