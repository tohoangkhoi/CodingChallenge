package com.CodingChallenge.models;

public class Employee {
    private String firstName;
    private String lastName;
    private int annualSalary;
    private int paymentMonth;
    private double superRate;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int annualSalary, int paymentMonth, double superRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
        this.paymentMonth = paymentMonth;
        this.superRate = superRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
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

    public double getSuperRate() {
        return superRate;
    }

    public void setSuperRates(double superRate) {
        this.superRate = superRate;
    }
}
