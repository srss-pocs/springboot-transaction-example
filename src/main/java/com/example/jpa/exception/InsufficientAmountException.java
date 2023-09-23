package com.example.jpa.exception;

public class InsufficientAmountException extends RuntimeException {

	private static final long serialVersionUID = 1242187116947724436L;

	public InsufficientAmountException(String msg) {
		super(msg);
	}
}
