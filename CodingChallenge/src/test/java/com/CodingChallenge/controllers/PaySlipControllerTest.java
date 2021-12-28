package com.CodingChallenge.controllers;

import com.CodingChallenge.models.Employee;
import com.CodingChallenge.models.PaySlip;
import com.CodingChallenge.services.PaySlipService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;


import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
class PaySlipControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PaySlipService paySlipService;

    @Autowired
    private PaySlipController paySlipController;

    private List<Employee> testList;


    @BeforeEach
    void setUp() {

        paySlipController = new PaySlipController(paySlipService);
      //EmployeeList
        Employee employee1 = new Employee("Ryan", "Chen", 120000, 2, 0.5);
        Employee employee2 = new Employee("BUI", "Minh Nhat", 150000, 1, 0.12);

        testList = new ArrayList<>();
        testList.add(employee1);
        testList.add(employee2);
    }



    @Test
    void canGeneratePaySlipForEmployeeList() throws Exception {

        //Given
        PaySlip payslip1 = new PaySlip(testList.get(0), "27 December", "27 February", 10000, 2670, 5000, 7330);
        PaySlip payslip2 = new PaySlip(testList.get(1), "27 December", "27 January", 12500, 3595, 1250, 8905);

        List<PaySlip> expectedResult = new ArrayList<>();
        expectedResult.add(payslip1);
        expectedResult.add(payslip2);

        //When
        when(paySlipService.returnEmployeesPayslip(testList)).thenReturn(expectedResult);

        List<PaySlip> output = paySlipController.getEmployeesPayslip(testList);

        //Then
        assertEquals(expectedResult.get(0).getNetIncome(), output.get(0).getNetIncome());

    }





}