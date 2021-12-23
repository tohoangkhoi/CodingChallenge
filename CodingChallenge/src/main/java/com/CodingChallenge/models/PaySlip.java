package com.CodingChallenge.models;

import com.CodingChallenge.helpers.TaxRangeConstant;



public class PaySlip {
    private Employee employee;
    private String fromDate;
    private String toDate;
    private int grossIncome;
    private int incomeTax;
    private double superAnnuation;
    private int netIncome;

    private TaxRangeConstant taxable;

    public PaySlip(Employee employee, String fromDate, String toDate, int grossIncome, int incomeTax, double superAnnuation, int netIncome) {
        this.employee = employee;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.grossIncome = grossIncome;
        this.incomeTax = incomeTax;
        this.superAnnuation = superAnnuation;
        this.netIncome = netIncome;

    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public int getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(int grossIncome) {
        this.grossIncome = grossIncome;
    }

    public int getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(int incomeTax) {
        this.incomeTax = incomeTax;
    }

    public double getSuperAnnuation() {
        return superAnnuation;
    }

    public void setSuperAnnuation(double superAnnuation) {
        this.superAnnuation = superAnnuation;
    }

    public int getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(int netIncome) {
        this.netIncome = netIncome;
    }
}
