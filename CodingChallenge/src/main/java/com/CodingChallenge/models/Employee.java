package com.CodingChallenge.models;

public class Employee {
    private String firstname;
    private String lastName;
    private int annualSalary;
    private int paymentMonth;
    private float superRates;

    public Employee() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getPaymentMonth() {
        return paymentMonth;
    }

    public void setPaymentMonth(int paymentMonth) {
        this.paymentMonth = paymentMonth;
    }

    public float getSuperRates() {
        return superRates;
    }

    public void setSuperRates(float superRates) {
        this.superRates = superRates;
    }
}
