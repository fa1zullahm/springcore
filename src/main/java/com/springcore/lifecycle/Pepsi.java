package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {

	private double price;
	
	
	public Pepsi() {
		super();	
		System.out.println(" Pepsi Default Constructor runs");
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Pepsi Setter Ran: Set Price="+price);
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("pepsi  init ");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("pepsi Destroy method collects bean");
		// TODO Auto-generated method stub
		
	}

	

}
