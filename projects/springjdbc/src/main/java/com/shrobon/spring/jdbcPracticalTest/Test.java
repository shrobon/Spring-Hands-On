package com.shrobon.spring.jdbcPracticalTest;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.shrobon.spring.jdbcPractical.Employee;
import com.shrobon.spring.jdbcPractical.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/shrobon/spring/jdbcPracticalTest/config.xml");
		EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");
		//Employee employee = new Employee();
		//employee.setId(2);
		//employee.setFirstName("Damayanti");
		//employee.setLastName("Biswas");
		//int result = dao.create(employee);
		//int result = dao.update(employee);
		//Employee emp = dao.read(2);
		
		List<Employee> result = dao.read();
		System.out.println("Employee records: " + result );
	}

}
