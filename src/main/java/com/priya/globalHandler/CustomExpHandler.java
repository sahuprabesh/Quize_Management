package com.priya.globalHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.priya.exception.QuestionException;

//if Any exception rise in anywhere then that will come to here
@ControllerAdvice
public class CustomExpHandler {

	@ExceptionHandler(QuestionException.class)
	public String questionExceptionHandler(QuestionException qe)
	{
		return qe.getMessage();
	}
}
