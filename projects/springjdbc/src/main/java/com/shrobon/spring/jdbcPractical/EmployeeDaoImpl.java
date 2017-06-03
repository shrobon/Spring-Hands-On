package com.shrobon.spring.jdbcPractical;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee employee) {
		String sql= "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql,employee.getId(),employee.getFirstName(),employee.getLastName());
		return result;
	}

}
