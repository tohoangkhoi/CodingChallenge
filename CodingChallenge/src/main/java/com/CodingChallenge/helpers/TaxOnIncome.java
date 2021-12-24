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

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxAddition() {
        return taxAddition;
    }

    public void setTaxAddition(double taxAddition) {
        this.taxAddition = taxAddition;
    }

    public double getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(double lowerBound) {
        this.lowerBound = lowerBound;
    }

    @Override
    public String toString() {
        return "TaxOnIncome{" +
                "taxRate=" + taxRate +
                ", taxAddition=" + taxAddition +
                ", lowerBound=" + lowerBound +
                '}';
    }
}
