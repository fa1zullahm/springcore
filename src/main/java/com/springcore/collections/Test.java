package com.springcore.collections;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SocketUtils;

import com.springcore.collections.Emp;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("\\com\\springcore\\collections\\CollectionConfig.xml");
		Emp emp1 = context.getBean("emp1",Emp.class);
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getProps());
		
		System.out.println(emp1.getName().getClass().getName());
		System.out.println(emp1.getPhones().getClass().getName());
	}
}
