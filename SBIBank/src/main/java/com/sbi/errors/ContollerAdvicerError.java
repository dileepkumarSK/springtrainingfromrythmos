package com.sbi.errors;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ContollerAdvicerError {

	
	@ExceptionHandler
	public ResponseEntity<ErrorMessge> handle(NosufficentFund error)
	{
		ErrorMessge message=new ErrorMessge();
		message.setMessage(error.getMessage());
		message.setStatus(HttpStatus.NOT_FOUND.value());
		message.setTime( System.currentTimeMillis());
		
		return new ResponseEntity<ErrorMessge>(message,HttpStatus.NOT_FOUND);
	}
}
