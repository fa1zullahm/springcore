package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	
	@Value("McPherson")
	private String street;
	
	@Value("Detroit")
	private String city;
	
	@Value("Michigan")
	private String state;
	
	@Value("USA")
	private String country;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	

}
