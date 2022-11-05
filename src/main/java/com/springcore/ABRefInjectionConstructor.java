package com.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;
import com.springcore.ref.Y;

public class ABRefInjectionConstructor {
	 public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("\\com\\springcore\\ref\\refconfig.xml");
		 Y y = context.getBean("y",Y.class);
		 System.out.println(y);
		 
	}

}
