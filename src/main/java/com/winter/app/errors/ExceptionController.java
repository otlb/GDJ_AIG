package com.winter.app.errors;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(NullPointerException.class)
	public String hadler1() {
		
		return "errors/error";
	}
	
	@ExceptionHandler(Exception.class)
	public String hadler2() {
		
		return "errors/error";
	}
	
	@ExceptionHandler(Throwable.class)
	public String hadler3() {
		
		return "errors/error";
	}
	
	@ExceptionHandler(RuntimeException.class)
	public String hadler4() {
		
		return "errors/error";
	}
	
}
