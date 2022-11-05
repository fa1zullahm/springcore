package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*@ComponentScan("base-package=com.springcore.javaconfig")*/
public class JavaConfig {
	
	@Bean
	public Student getStudent() {
		
		Student student = new Student(getAddress());
		return student;
	}
	
	@Bean
	public Address getAddress() {
		return new Address();
	}

}
