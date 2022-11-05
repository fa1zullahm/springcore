package com.springcore.stereotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {


		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com\\springcore\\stereotype\\stereotypeconfig.xml");
		
		Student student = context.getBean("ob",Student.class);		
		System.out.println(student.hashCode());
		System.out.println(student.getCourses().getClass().getName());
		
		Student student1 = context.getBean("ob",Student.class);		
		System.out.println(student1.hashCode());

				
		
		
	}

}
