package com.CodingChallenge.exceptions;

public class InvalidAnnualSalaryExceptionResponse {
    private String annualSalary;

    public InvalidAnnualSalaryExceptionResponse(String annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(String annualSalary) {
        this.annualSalary = annualSalary;
    }
}
