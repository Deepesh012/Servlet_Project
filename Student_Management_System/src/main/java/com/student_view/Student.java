package com.student_view;

import java.io.Serializable;

public class Student implements Serializable {

	private int rollno;
	private String name;
	private long phone;
	private String email;
	private int age;
	private String address;
	private String password;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student[rollno=" + rollno + ", name=" + name + ", phone=" + phone + ", email=" + email + ", age=" + age+",address=" + address + ", password=" + password + "]";
	}
	public Student(int rollno, String name, long phone, String email, int age, String address, String password) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.age = age;
		this.address = address;
		this.password = password;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
