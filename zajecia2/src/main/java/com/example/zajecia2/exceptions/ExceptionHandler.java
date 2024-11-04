package com.example.zajecia2.exceptions;

import com.example.zajecia2.model.Auto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {NotFoundException.class})
    ResponseEntity<Object> handleNotFound(RuntimeException e, WebRequest request) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);


    }

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {CarAlreadyExistsException.class})
    ResponseEntity<Object>  handleAlreadyExists(RuntimeException e, WebRequest request){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }




}
