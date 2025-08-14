package com.findissue.exception;

public class IlligalParamatersException extends RuntimeException {
	
	 public IlligalParamatersException() {
	        super("Error, Enter a valid Organization name and Repository Name");
	    }
	 
	 public IlligalParamatersException(String message) {
	        super(message);
	    }


}
