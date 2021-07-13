package com.bmpl.AnnotaionFieldInjectionWithPropertiesFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("a")
public class A {
	
	@Value("${name}")
	private String name;
	@Value("${dob}")
	private String dob;
	@Value("${phone}")
	private String phone;
	@Value("${email}")
	private String email;
	
	
	public String getName() {
		return name;
	}
	public String getDob() {
		return dob;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}


	public A() {
		System.out.println("A constructor");
	}
	

}
