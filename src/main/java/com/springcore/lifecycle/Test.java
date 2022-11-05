package com.springcore.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("\\com\\springcore\\lifecycle\\config.xml");
		 context.registerShutdownHook();//now Context will call destroy-method on collecting the object
		 
		 Samosa samosa = context.getBean("samosa",Samosa.class);
		 System.out.println(samosa);		 
		 
		 Pepsi pepsi = context.getBean("pepsi",Pepsi.class);
		 System.out.println(pepsi);
	}
}
