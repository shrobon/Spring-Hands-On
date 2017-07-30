package com.shrobon.spring.springmvc.springmvcREDO.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamsController {
	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("sal") double salary) {
		System.out.println("ID: " + id);
		System.out.println("NAME: " + name);
		System.out.println("SALARY: " + salary);

		return new ModelAndView("userReg");
	}
}
