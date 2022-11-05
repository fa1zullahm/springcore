package com.springcore.spel;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Demo {
	
	@Value("#{ new MyClassForSpEL()  }")
	private MyClassForSpEL el;

	public MyClassForSpEL getEl() {
		return el;
	}

	public void setEl(MyClassForSpEL el) {
		this.el = el;
	}

	@Override
	public String toString() {
		return "Demo [el=" + el + "]";
	}
	
	
	
	
	
}
