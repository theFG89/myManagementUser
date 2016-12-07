package com.userManagement.controller;

import java.util.List;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import com.userManagement.dao.userDaoImpl;
import com.userManagement.model.user;

@Controller
@RequestMapping("/")
public class appController {
	
		// RICHIESTO LISTA UTENTI	
	    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	    public String listUsers(ModelMap model) {
	 
	        List<user> users = userDaoImpl.findAllUsers();		//PRIMA ERA USERSERVICE
	        model.addAttribute("user", users);
	        model.addAttribute("loggedinuser", getPrincipal());
	        return "userslist";
	    }
	        
	    @RequestMapping(value = "/login", method = RequestMethod.GET)
	    public String loginPage() {
	        if (isCurrentAuthenticationAnonymous()) {
	            return "login";
	        } else {
	            return "redirect:/list";  
	        }
	    }
}
