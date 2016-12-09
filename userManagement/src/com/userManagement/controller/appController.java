package com.userManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import com.userManagement.dao.userDaoImpl;
import com.userManagement.model.user;

@Controller
@RequestMapping("/")
public class appController {
	
	@Autowired
    AuthenticationTrustResolver authenticationTrustResolver;
	
		// RICHIESTO LISTA UTENTI	
	/*    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	    public String listUsers(ModelMap model) {
	 
	        List<user> users = userDaoImpl.getAllUser();		//PRIMA ERA USERSERVICE
	        model.addAttribute("user", users);
	        model.addAttribute("loggedinuser", getPrincipal());
	        return "userslist";
	    }*/
	       //**  Se l'utente è già salvato allora lo reindirizzo subito alla lista utenti, altrimenti dovrà effettuare il login  											
	    @RequestMapping(value = "/login", method = RequestMethod.GET)
	    public String loginPage() {
	        if (isCurrentAuthenticationAnonymous()) {
	            return "login";
	        } else {
	            return "redirect:/list";  
	        }
	    }
	    
	    /**
	     * This method returns true if users is already authenticated [logged-in], else false.
	     */
	    private boolean isCurrentAuthenticationAnonymous() {
	        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	        return authenticationTrustResolver.isAnonymous(authentication);
	    }
}
