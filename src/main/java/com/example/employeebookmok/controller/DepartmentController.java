package com.example.employeebookmok.controller;

import com.example.employeebookmok.service.EmployeeService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    EmployeeService employeeService;
    EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    
}
