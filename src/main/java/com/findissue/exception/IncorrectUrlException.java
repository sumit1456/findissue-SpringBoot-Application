package com.findissue.exception;

public class IncorrectUrlException extends RuntimeException {
	public String getMessage() {
		return "Incorrect Url or Api call";
	}

}
