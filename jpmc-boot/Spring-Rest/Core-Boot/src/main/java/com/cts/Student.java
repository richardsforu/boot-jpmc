package com.cts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.Department;

@Component
public class Student {

	@Autowired
	private Department dept;

	public void f2() {
		System.out.println("...Student f2 method");
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

}
