package com.mav.user.entity;

import org.springframework.http.HttpStatus;

public class ApplicationError 
{
	private String message;
	private HttpStatus httpstatus;
	
	public ApplicationError(String message, HttpStatus httpstatus) {
		super();
		this.message = message;
		this.httpstatus = httpstatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getHttpstatus() {
		return httpstatus;
	}

	public void setHttpstatus(HttpStatus httpstatus) {
		this.httpstatus = httpstatus;
	}
	
	

}
