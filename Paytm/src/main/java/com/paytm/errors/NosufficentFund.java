package com.paytm.errors;

public class NosufficentFund extends RuntimeException {

	public NosufficentFund(String message, Throwable cause) {
		super(message, cause);
		
	}

	public NosufficentFund() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NosufficentFund(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NosufficentFund(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NosufficentFund(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
