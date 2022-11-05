package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	//@Autowired //(on a property - 1 method)
	//@Qualifier("temp")
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired //(on a property - 2 method)
	@Qualifier("temp")
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("injection via setter method");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired //(on a property - 3 method)
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("injection via Constructor ");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
    
}
