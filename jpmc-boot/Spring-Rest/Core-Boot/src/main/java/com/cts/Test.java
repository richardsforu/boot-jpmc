package com.cts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Test {
	
	
	@Value("${name}")
	private String empName;

	public void f1() {
		System.out.println("--- f1 method of Test name is "+empName);
	}
}
