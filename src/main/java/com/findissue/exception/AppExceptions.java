package com.findissue.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.util.InvalidUrlException;

@ControllerAdvice
public class AppExceptions {
	

	
	@ExceptionHandler
	public String catchIlligalParametersException(IlligalParamatersException ie, Model model) {
		model.addAttribute("errorMessage", ie.getMessage());
		return "err";
	}
	
	@ExceptionHandler
	public String catchServerErrorException(ServerErrorException see, Model model) {
		model.addAttribute("errorMessage", see.getMessage());
		return "err";
	}
	
	@ExceptionHandler
	public String catchGenericException(Exception g, Model model) {
		model.addAttribute("errorMessage", g.getMessage());
		return "err";
	}
	
	@ExceptionHandler
	public String catchIncorrectUrlException(IncorrectUrlException iue, Model model) {
		model.addAttribute("errorMessage", iue.getMessage());
		return "err";
	}
	

}
