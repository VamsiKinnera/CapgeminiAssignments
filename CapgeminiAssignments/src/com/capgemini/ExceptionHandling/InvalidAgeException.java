package com.capgemini.ExceptionHandling;

import java.io.EOFException;

public class InvalidAgeException extends EOFException {
	InvalidAgeException(String s){
		super(s);
	}

	
}
