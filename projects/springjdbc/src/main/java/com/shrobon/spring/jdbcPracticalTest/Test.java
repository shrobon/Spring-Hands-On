package com.shrobon.spring.jdbcPracticalTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.shrobon.spring.jdbcPractical.Employee;
import com.shrobon.spring.jdbcPractical.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/jdbcPracticalTest/config.xml");
		EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstName("Rex");
		employee.setLastName("Biswas");
		int result = dao.create(employee);
		System.out.println("Number of records inserted are: " + result );
	}

}
