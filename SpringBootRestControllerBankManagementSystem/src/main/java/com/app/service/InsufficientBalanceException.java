package com.app.service;

public class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(String message) {
		super(message);
	}

}
