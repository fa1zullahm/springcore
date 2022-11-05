package com.springcore.spel;


import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {


	ApplicationContext context = new ClassPathXmlApplicationContext("com\\springcore\\spel\\spelconfig.xml");
	
	Demo demo = (Demo)context.getBean("demo");
	
	MyClassForSpEL el = demo.getEl();
	System.out.println(demo);
	
	el.setFirstName("Faizullah");
	el.setLastName("Muhammad");
	
	System.out.println(el);

	}

}
