package com.example.HospitalManagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvice{

   @ExceptionHandler(value = UserNotFoundException.class)
   public ResponseEntity<Object> handleUserNotFoundError(UserNotFoundException exception)
   {
	   return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
   }
   
   @ExceptionHandler(value = UserAlreadyExistException.class)
   public ResponseEntity<Object> handleUserNotFoundError(UserAlreadyExistException exception)
   {
	   return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
   }
}