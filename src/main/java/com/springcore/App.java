package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	
    public static void main( String[] args )   {
        System.out.println( "Hello World!" );      
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");       
        Student student = context.getBean("student1",Student.class);      
        
        System.out.println(student);
        
    }
}