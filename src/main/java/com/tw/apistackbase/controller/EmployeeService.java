package com.tw.apistackbase.controller;



import java.util.List;
import java.util.ArrayList;

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

    //public List<Employee> create(Employee employee) {
       // employees.add(employee);
       // return this.employees;
    //}
}

