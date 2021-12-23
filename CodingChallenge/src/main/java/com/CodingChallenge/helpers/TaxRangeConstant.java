package com.CodingChallenge.helpers;

public class TaxRangeConstant {

    public static TaxableRange FIRST_TAX_RANGE = new TaxableRange(0, 18200);
    public static TaxableRange SECOND_TAX_RANGE = new TaxableRange(18201, 37000);
    public static TaxableRange THIRD_TAX_RANGE = new TaxableRange(37001, 87000);
    public static TaxableRange FOURTH_TAX_RANGE = new TaxableRange(87001, 180000);
    public static TaxableRange FIFTH_TAX_RANGE = new TaxableRange(180001, 182002);// 180001 -> more

}

