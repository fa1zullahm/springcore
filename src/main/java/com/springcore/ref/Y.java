package com.springcore.ref;

public class Y {
	private int age;
	private Z zee;
	public Y(int age, Z zee) {
		super();
		this.age = age;
		this.zee = zee;
	}
	public int getAge() {
		return age;
	}
	public Z getZee() {
		return zee;
	}
	@Override
	public String toString() {
		return "Y [age=" + age + ", zee=" + zee + "]";
	}
	
   
}
