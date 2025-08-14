package com.findissue.exception;

public class ServerErrorException extends RuntimeException {
	
	public String getMessage() {
		return "Unable to get the response from the server, Please enter valid values";
	}

}
