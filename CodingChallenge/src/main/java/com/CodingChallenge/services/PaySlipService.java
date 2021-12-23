package com.CodingChallenge.services;

import com.CodingChallenge.helpers.TaxOnIncome;
import com.CodingChallenge.helpers.TaxOnIncomeConstant;
import com.CodingChallenge.helpers.TaxRangeConstant;
import com.CodingChallenge.models.Employee;
import com.CodingChallenge.models.PaySlip;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.NavigableMap;
import java.util.TreeMap;

@Service
public class PaySlipService {
    private TaxRangeConstant taxable;

    /*
     *The navigable map provide a very help function:
     *ceilingKey(int value) :
     *It returns the lowest key in the map which
     greater than the "value". This function will help us determine the correct
     tax for a specific annual salary.
     */
    private NavigableMap<Integer, TaxOnIncome> taxableIncomeStore = new TreeMap<>();

    /*Function addTaxbleIncomes()
     * Add these kinds of objects to map:
     *  (key: taxRangeUpperBound, value: taxOnIncome(taxRate, taxAddition,taxRangeLowerBound)
     */
    private void addTaxableIncomes() {
        taxableIncomeStore.put(TaxRangeConstant.FIRST_TAX_RANGE.upperBound, TaxOnIncomeConstant.FIRST_TAX_ON_INCOME);
        taxableIncomeStore.put(TaxRangeConstant.SECOND_TAX_RANGE.upperBound, TaxOnIncomeConstant.SECOND_TAX_ON_INCOME);
        taxableIncomeStore.put(TaxRangeConstant.THIRD_TAX_RANGE.upperBound, TaxOnIncomeConstant.THIRD_TAX_ON_INCOME);
        taxableIncomeStore.put(TaxRangeConstant.FOURTH_TAX_RANGE.upperBound, TaxOnIncomeConstant.FOURTH_TAX_ON_INCOME);
        taxableIncomeStore.put(TaxRangeConstant.FIFTH_TAX_RANGE.upperBound, TaxOnIncomeConstant.FIFTH_TAX_ON_INCOME);
    }

    public PaySlip generatePayslip(Employee employee) {
        String fromDate = this.getDateFrom();
        String toDate = this.getDateto(employee.getPaymentMonth());
        int grossIncome = this.getGrossIncome(employee.getAnnualSalary());
        int incomeTax = this.getTaxIncome(employee.getAnnualSalary());
        double superAnnuation = this.getSuper(employee.getAnnualSalary(), employee.getSuperRate());
        int netIncome = grossIncome - incomeTax;

        return new PaySlip(employee, fromDate, toDate, grossIncome, incomeTax, superAnnuation, netIncome);

    }


    public TaxOnIncome getTaxOnIncome(int annualSalary) {
        this.addTaxableIncomes();
        Integer temp = taxableIncomeStore.ceilingKey(annualSalary);
        return taxableIncomeStore.get(temp);
    }

    public int getTaxIncome(int annualSalary) {
        TaxOnIncome taxOnIncome = getTaxOnIncome(annualSalary);
        return (int)((taxOnIncome.taxRate + (annualSalary - taxOnIncome.lowerBound) * taxOnIncome.taxAddition)/12) ;
    }

    public int getGrossIncome(int annualSalary) {
        return annualSalary/12;
    }

    public int getNetIncome(int annualSalary) {
        double taxIncome = getTaxIncome(annualSalary);
        return (int) (this.getGrossIncome(annualSalary) - taxIncome);
    }

    public int getSuper(int annualSalary, double superRate) {
        return  (int)(this.getGrossIncome(annualSalary) * superRate);
    }

    public String getDateFrom() {
        LocalDate dateFrom = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL");
        return dateFrom.format(formatter);
    }


    public String getDateto(int paymentMonth ) {
        LocalDate dateTo = LocalDate.now().plusMonths(paymentMonth);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL");
        return dateTo.format(formatter);
    }
}
