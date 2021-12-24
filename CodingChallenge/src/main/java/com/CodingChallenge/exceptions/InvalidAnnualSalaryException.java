package com.CodingChallenge.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidAnnualSalaryException extends RuntimeException{
    public InvalidAnnualSalaryException(String message) {
        super(message);
    }
}
