package com.userManagement.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 * Just because SecurityConfig exists, does not mean that our Spring application knows 
 * about it. In this instance, our Spring root application context is initialized
 *  using MessageWebApplicationInitializer which is included with our 
 *  spring-security-samples-messages-jc project. You can find a snippet of it below:
 */

public class appInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

   @Override
   protected Class<?>[] getRootConfigClasses() {
       return new Class[] { appConfig.class };
   }
 
   @Override
   protected Class<?>[] getServletConfigClasses() {
       return null;
   }
 
   @Override
   protected String[] getServletMappings() {
       return new String[] { "/" };
   }

}