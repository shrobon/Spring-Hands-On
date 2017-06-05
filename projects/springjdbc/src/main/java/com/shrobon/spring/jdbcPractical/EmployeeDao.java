package com.shrobon.spring.jdbcPractical;

import java.util.List;

public interface EmployeeDao {
	int create(Employee employee);
	int update(Employee employee);
	Employee read(int id);
	List<Employee> read();
}
