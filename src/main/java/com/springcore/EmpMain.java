package com.springcore;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SocketUtils;

import com.springcore.collections.Emp;

public class EmpMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CollectionConfig.xml");
		Emp emp = context.getBean("emp",Emp.class);
		
		List<String> phones = emp.getPhones();
		System.out.println("--- Before -----");
		phones.forEach(phone -> System.out.println(phone));
		phones.removeIf(p->p==null);//Remove if any value is NULL
		System.out.println("--- After -----");
		phones.forEach(phone -> System.out.println(phone));
		
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
		System.out.println(emp.getCourses());
		
	}
}
