package com.lalith.tableau.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javassist.NotFoundException;

@ControllerAdvice
public class ExceptionHandler {
	
	@org.springframework.web.bind.annotation.ExceptionHandler(UserException.class)
	public ResponseEntity<ErrorResponse> exceptionToDoHandler(Exception ex) {
		ErrorResponse error = new ErrorResponse();
		error.setErrorCode(HttpStatus.NOT_FOUND.value());
		error.setMessage(ex.getMessage());
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.NOT_FOUND);
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
		ErrorResponse error = new ErrorResponse();
		error.setErrorCode(HttpStatus.BAD_REQUEST.value());
		error.setMessage("The request could not be understood by the server due to malformed syntax.");
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.BAD_REQUEST);
}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> handleUserNotFoundException(Exception ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setErrorCode(ErrorCode.NOT_FOUND);
        errorResponse.setMessage(ex.getMessage());
        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
    }

}
