package com.tw.apistackbase.controller;

import com.tw.apistackbase.Employee;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class GetEmployees {

    EmployeeService employeeService;

    @Autowired
    public GetEmployees(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(produces = {"application/json"})
    public List<Employee> getAll() {


        EmployeeService employeeService = new EmployeeService();
        List<Employee> employees = employeeService.getAll();
        return employees;
    }

    @PostMapping(produces = {"application/json"})
    public void create(@RequestBody Employee employee) {

        employeeService.create(employee);

    }
    @PutMapping(produces = {"application/json"})
    public void modifyEmployee(@RequestBody Employee employee) {

        employeeService.modifyEmployee(employee);
    }

}




