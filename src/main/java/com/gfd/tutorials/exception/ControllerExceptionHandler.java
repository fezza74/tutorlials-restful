package com.gfd.tutorials.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.HandlerMethod;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ControllerExceptionHandler {
    private final ErrorResponse err = new ErrorResponse();

    @ExceptionHandler({ResourceNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public final ResponseEntity<ErrorResponse> excetpionNotFoundHandler(ResourceBadRequestException ex, HandlerMethod handlerMethod, HttpServletRequest httpServletRequest){
        err.setStatusCode(HttpStatus.NOT_FOUND.value());
        err.setPath(httpServletRequest.getRequestURL().toString());
        err.setMessage(ex.getMessage());
        err.setTimestamp(LocalDateTime.now());
        return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({ResourceBadRequestException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public final ResponseEntity<ErrorResponse> excetpionBadRequestHandler(ResourceBadRequestException ex, HandlerMethod handlerMethod, HttpServletRequest httpServletRequest){
        err.setStatusCode(HttpStatus.BAD_REQUEST.value());
        err.setPath(httpServletRequest.getRequestURL().toString());
        err.setMessage(ex.getMessage());
        err.setTimestamp(LocalDateTime.now());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
}
