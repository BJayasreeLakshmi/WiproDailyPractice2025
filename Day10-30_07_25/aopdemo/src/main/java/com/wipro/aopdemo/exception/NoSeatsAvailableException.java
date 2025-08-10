package com.wipro.aopdemo.exception;

public class NoSeatsAvailableException extends Exception {
	
	String messege;

	public  NoSeatsAvailableException(String message) {
	
	
        super(message);
	}
}
