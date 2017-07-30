package com.shrobon.spring.springmvc.springmvcREDO.controllers;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shrobon.spring.springmvc.amazon.userreg.dto.User;

@Controller
public class UserController {
	
	@RequestMapping("/registrationPage")
	public ModelAndView showRegistrationPage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userRej");
		return modelAndView;
	}
	
	
	@RequestMapping(value="registerUser", method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user){
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.setViewName("userRej");
		
		//Now performing end-to-end flow 
		modelAndView.addObject("user",user);
		modelAndView.setViewName("rejResult");
		return modelAndView;
	}
}
