package com.CodingChallenge.helpers;

public class TaxOnIncome {
    public double taxRate;
    public double taxAddition;
    public double lowerBound;

    public TaxOnIncome(double taxRate, double taxAddition, double lowerBound) {
        this.taxRate = taxRate;
        this.taxAddition = taxAddition;
        this.lowerBound = lowerBound;
    }
}
