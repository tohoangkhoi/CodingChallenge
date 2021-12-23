package com.CodingChallenge.helpers;

public class TaxOnIncomeConstant {
    public static TaxOnIncome FIRST_TAX_ON_INCOME = new TaxOnIncome(0, 0, TaxRangeConstant.FIFTH_TAX_RANGE.lowerBound);
    public static TaxOnIncome SECOND_TAX_ON_INCOME = new TaxOnIncome(0, 0.19, TaxRangeConstant.SECOND_TAX_RANGE.lowerBound);
    public static TaxOnIncome THIRD_TAX_ON_INCOME = new TaxOnIncome(3572, 0.325, TaxRangeConstant.THIRD_TAX_RANGE.lowerBound);
    public static TaxOnIncome FOURTH_TAX_ON_INCOME = new TaxOnIncome(19822, 0.37, TaxRangeConstant.FOURTH_TAX_RANGE.lowerBound);
    public static TaxOnIncome FIFTH_TAX_ON_INCOME = new TaxOnIncome(54232, 0.45, TaxRangeConstant.FIFTH_TAX_RANGE.lowerBound);
}
