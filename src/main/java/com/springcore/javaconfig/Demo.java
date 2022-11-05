package com.springcore.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = (Student)context.getBean("getStudent");
		System.out.println(student);
	}

}
