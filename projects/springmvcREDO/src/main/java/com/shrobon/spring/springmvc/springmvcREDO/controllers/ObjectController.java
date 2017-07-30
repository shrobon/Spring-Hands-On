package com.shrobon.spring.springmvc.springmvcREDO.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shrobon.spring.springmvc.springmvcREDO.dto.Employee;

@Controller
public class ObjectController {
	
	@RequestMapping("/readObject")
	public ModelAndView subject(){
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject" );
		
		Employee employee = new Employee();
		employee.setId(1234);
		employee.setName("Shrobon");
		employee.setSalary(8000);
		modelAndView.addObject("employee",employee );
		return modelAndView;
	}
}
