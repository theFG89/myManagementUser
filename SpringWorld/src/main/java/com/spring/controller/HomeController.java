package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="/welcome")
	public ModelAndView GetWelcome(Model model){
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** HELLO FABIO, Spring MVC ";
		return new ModelAndView("welcome", "message",message);
	}
}
