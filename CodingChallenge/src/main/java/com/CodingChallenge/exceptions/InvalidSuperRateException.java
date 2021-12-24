package com.CodingChallenge.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidSuperRateException extends RuntimeException{
    public InvalidSuperRateException(String message) {
        super(message);
    }
}
