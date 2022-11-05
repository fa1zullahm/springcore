package com.springcore.spel;

public class MyClassForSpEL {
	
	private String firstName;
	private String lastName;
	
	
	
	public MyClassForSpEL() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "MyClassForSpEL [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
