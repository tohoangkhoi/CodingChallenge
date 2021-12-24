package com.CodingChallenge.controllers;


import com.CodingChallenge.models.Employee;
import com.CodingChallenge.models.PaySlip;
import com.CodingChallenge.services.PaySlipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/payslip")
public class PaySlipController {

    @Autowired
    private PaySlipService paySlipService;

    @GetMapping("/")
    public List<?> getEmployeesPayslip(@RequestBody List<Employee> employeeList) {

        List<PaySlip> paySlips = new ArrayList<>();
        for(Employee employee: employeeList) {
            if(paySlipService.validateEmployeeDetail(employee)) {
                paySlips.add(paySlipService.generatePayslip(employee));
            }
        }
        return paySlips;
    }
}
