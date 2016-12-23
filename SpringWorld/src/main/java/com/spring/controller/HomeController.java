package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")	
public class HomeController {
	
	
	@RequestMapping(value="/welcome", method=RequestMethod.POST)
	public String  passValue(/*("SpringWeb")Employee emp,BindingResult result,*/@RequestParam("username") String username, 
						@RequestParam("password")String password, ModelMap model,HttpServletRequest request){
	
		model.addAttribute("username", username);		
		model.addAttribute("password", password);
		
		return "welcome";
			
						}
	
	@RequestMapping(value="/newuser" /*,method=RequestMethod.GET*/)
	public String saveUser(@RequestParam("newnew") String newnew ,ModelMap model){
		model.addAttribute("fromNEWUSER Methos", newnew);
		
		return "newuser";
		
	}

			
	}

	/*public ModelAndView GetWelcome(Model model){
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** HELLO FABIO, Spring MVC ";
				return new ModelAndView("welcome", "message",message);
	}
}
*/