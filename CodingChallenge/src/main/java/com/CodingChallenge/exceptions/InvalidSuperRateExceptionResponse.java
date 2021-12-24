package com.CodingChallenge.exceptions;

public class InvalidSuperRateExceptionResponse {
    public String superRate;

    public InvalidSuperRateExceptionResponse(String superRate) {
        this.superRate = superRate;
    }

    public String getSuperRate() {
        return superRate;
    }

    public void setSuperRate(String superRate) {
        this.superRate = superRate;
    }
}
