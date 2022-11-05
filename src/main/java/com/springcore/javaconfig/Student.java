package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	private Address address;
	
	@Value("WayneStateUniversity")
	private String school;

	@Value("2")
	private int duration;

	
	
	public Student(Address address) {
		super();
		this.address = address;
	}

	String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + ", school=" + school + ", duration=" + duration + "]";
	}

	

}
