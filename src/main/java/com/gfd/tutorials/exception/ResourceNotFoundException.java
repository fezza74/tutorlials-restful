package com.gfd.tutorials.exception;

import java.io.Serial;

// Error status 404
public class ResourceNotFoundException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;
    private String message;
    public ResourceNotFoundException(String message) {
        super(message);
        setMessage(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
