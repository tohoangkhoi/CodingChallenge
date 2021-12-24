package com.CodingChallenge.services;

import com.CodingChallenge.helpers.TaxOnIncome;
import com.CodingChallenge.helpers.TaxOnIncomeConstant;
import com.CodingChallenge.helpers.TaxRangeConstant;
import com.CodingChallenge.models.Employee;
import com.CodingChallenge.models.PaySlip;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


class PaySlipServiceTest {

    private PaySlipService underTest;

    private Employee testEmployee;

    @BeforeEach
    void setUp() {
        underTest  = new PaySlipService();
        testEmployee = new Employee("David", "Rudd", 60050, 1, 0.09 );
    }

    @Test
    void generatePayslipTesting() {
        //when
        PaySlip output = underTest.generatePayslip(testEmployee);

        //then
        PaySlip expected = new PaySlip(testEmployee, underTest.getDateFrom(),
                                       underTest.getDateto(1),5004,
                             922, 450, 4082 );

        assertEquals(output.toString(), expected.toString());
    }

    @Test
    void getTaxOnIncomeTesting() {
        //when:
        TaxOnIncome output = underTest.getTaxOnIncome(testEmployee.getAnnualSalary());

        /**then:
         * With annual salary = 60050
         * expected:
         * taxRate: 3572.0
         * taxAddition: 0.325
         */
        TaxOnIncome expected = new TaxOnIncome(
                TaxOnIncomeConstant.THIRD_TAX_ON_INCOME.getTaxRate(),
                TaxOnIncomeConstant.THIRD_TAX_ON_INCOME.taxAddition,
                TaxRangeConstant.THIRD_TAX_RANGE.lowerBound);
        assertThat(output.toString()).isEqualTo(expected.toString());
    }

    @Test
    void getTaxIncomeTesting() {
        //when
        int taxOnIncome = underTest.getTaxIncome(testEmployee.getAnnualSalary());

        /*then
        * with annual salary = 60050
        * expected taxIncome: 922
        */
        int expected = 922;
        assertEquals(taxOnIncome, expected);
    }

}