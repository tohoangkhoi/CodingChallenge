package com.CodingChallenge.controllers;

import com.CodingChallenge.models.Employee;
import com.CodingChallenge.services.PaySlipService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class PaySlipControllerTest {
    @Mock private PaySlipService paySlipService;
    private PaySlipController underTest;
    private AutoCloseable autoCloseable;
    private List<Employee> testList;

    @BeforeEach
    void setUp() {
      autoCloseable =MockitoAnnotations.openMocks(this);
      underTest = new PaySlipController();
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGeneratePaySlipForEmployeeList() {

    }



}