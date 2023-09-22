package com.gfd.tutorials.exception;

import java.io.Serial;

// Error status 400
public class ResourceBadRequestException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;
    private String message;

   public ResourceBadRequestException(String message) {
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
