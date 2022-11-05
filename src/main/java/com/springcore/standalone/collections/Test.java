package com.springcore.standalone.collections;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("\\com\\springcore\\standalone\\collections\\aloneconfig.xml");
		Person person = context.getBean("person1",Person.class);
		System.out.println(person);
		
		List<String> list = person.getFriends();
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println(person.getFriends().getClass().getName());
	}

}
