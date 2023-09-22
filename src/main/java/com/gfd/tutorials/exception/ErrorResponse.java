package com.gfd.tutorials.exception;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class ErrorResponse
{
    private int statusCode;
    private String message;
    private LocalDateTime timestamp;
    private String path;
}
