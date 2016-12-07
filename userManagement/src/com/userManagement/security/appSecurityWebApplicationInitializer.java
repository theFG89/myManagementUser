package com.userManagement.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;


//
//The appSecurityWebApplicationInitializer will automatically register the 
//springSecurityFilterChain Filter for every URL in your application. If Filters are 
//added within other WebApplicationInitializer instances we can use @Order to control
//the ordering of the Filter instances.
//
public class appSecurityWebApplicationInitializer  
			extends  AbstractSecurityWebApplicationInitializer{

}
