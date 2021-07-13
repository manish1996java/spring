package com.bmpl.InjectLiteralValueWithPropertyFile;

public class A implements Z{
	private String name;
	private String dob;
	private int phone;
	private String email;
	
	
	private B b;
	
//	Default constructor
	public A() {
		System.out.println("A Constructor");
	}
	
	
//	create setter getter	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}



	//Setter Method of b field
	public void setB(B b) {
		this.b = b;
	}


	//parameterized constructor
	public String show() {
		
		return "A show method";
	}
	
	public String print() {
		
		return b.print();
	}

	
	
}
