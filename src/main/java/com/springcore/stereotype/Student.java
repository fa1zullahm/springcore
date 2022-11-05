// Tutorial 22-23
// 22 - @Component and @Value
// 23 - @{korses}
package com.springcore.stereotype;


import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("singleton")
public class Student {
	
	@Value("Faizullah")
	private String studentName;
	
	@Value("Canton")
	private String studentCity;
	
	@Value("#{courses}")//SpEL
	private Set<String> courses;
	
	public Set<String> getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentCity=" + studentCity + ", courses=" + courses + "]";
	}	
}