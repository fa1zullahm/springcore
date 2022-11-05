package com.springcore.ref;

public class A {

	private int x;
	private B bo;
	public A(int x, B bo) {
		super();
		this.x = x;
		this.bo = bo;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {		
		this.x = x;
	}
	public B getBo() {
		return bo;
	}
	public void setBo(B bo) {
		this.bo = bo;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", bo=" + bo + "]";
	}
	
	

}
