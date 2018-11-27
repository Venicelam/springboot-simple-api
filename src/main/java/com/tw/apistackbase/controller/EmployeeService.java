package com.tw.apistackbase.controller;


import org.springframework.stereotype.Service;
import com.tw.apistackbase.Employee;

import java.util.List;
import java.util.ArrayList;

@Service
public class EmployeeService {

    private List<Employee> employees;
    //private int idIndex = 0;

    public EmployeeService(){
        this.employees = new ArrayList<>();
        this.employees.add(new Employee("1","Amy",18, "Female"));
    }
    public List<Employee> getAll(){
        return this.employees;
    }

    public List<Employee> create(Employee employee) {
        employees.add(employee);
        return this.employees;
    }
}

