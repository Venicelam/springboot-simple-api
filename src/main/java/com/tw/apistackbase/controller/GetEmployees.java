package com.tw.apistackbase.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/employee")
public class GetEmployees {

    EmployeeService employeeService;
    @Autowired
    public GetEmployees(EmployeeService employees){
        this.employeeService = employeeService;
    }
    @GetMapping(produces = {"application/json"})
    public List<Employee> getAll() {


        EmployeeService employeeService = new EmployeeService();
        List<Employee> employees = employeeService.getAll();
        return employees;
    }
   // @PostMapping(produces = {"application/json"})
   // public List<Employee> create(@RequestBody Employee employee) {

      //  EmployeeService employeeService = new EmployeeService();
       // List<Employee> employees = employeeService.create(employee);
       // return employees;

    }


}

