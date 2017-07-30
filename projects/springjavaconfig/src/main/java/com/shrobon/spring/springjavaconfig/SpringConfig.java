package com.shrobon.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(DaoConfig.class)
public class SpringConfig {

	@Bean(initMethod="init", destroyMethod="destroy")
	@Scope("singleton") // defining the scopes
	public Service service(){
		return new Service();
	}
	
}
