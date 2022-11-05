package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Samosa Setter runs");
		this.price = price;
	}

	public Samosa() {
		super();
		System.out.println("Default Samosa Constructor runs");
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void hey() {
		System.out.println("Samosa init: Hey");
	}

	public void bye() {
		System.out.println("Samosa destroy: bye");
	}
}
