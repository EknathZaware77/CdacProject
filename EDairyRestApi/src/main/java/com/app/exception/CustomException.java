package com.app.exception;

@SuppressWarnings("serial")
public class CustomException extends Exception {
	public CustomException(String message) {
		super(message);
	}
}