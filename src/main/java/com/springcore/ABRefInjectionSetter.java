package com.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;

public class ABRefInjectionSetter {
	 public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("\\com\\springcore\\ref\\refconfig.xml");
		 A a = context.getBean("a",A.class);
		 System.out.println(a);
		 
	}

}
