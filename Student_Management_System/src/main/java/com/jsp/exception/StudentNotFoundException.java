package com.jsp.exception;

public class StudentNotFoundException extends RuntimeException {
	private String message;
	public StudentNotFoundException(String message) {
		this.message=message;
	}
	

}
