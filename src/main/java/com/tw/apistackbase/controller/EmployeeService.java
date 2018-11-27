package com.tw.apistackbase.controller;


import org.springframework.stereotype.Service;
import com.tw.apistackbase.Employee;

import java.util.List;
import java.util.ArrayList;

@Service
public class EmployeeService {

    private List<Employee> employees;
    private int idIndex = 0;

    public EmployeeService() {
        this.employees = new ArrayList<>();
        this.employees.add(new Employee(1, "Amy", 18, "Female"));
        this.employees.add(new Employee(2, "Bobby", 15, "Male"));
        this.employees.add(new Employee(3, "Cindy", 12, "Female"));

    }

    public List<Employee> getAll() {
        return this.employees;
    }

    public void create(Employee employee) {
        employees.add(employee);
        employee.setId(idIndex++);

    }

    public void modifyEmployee(Employee employee) {
        int idIndex = employee.getId();
        for (Employee employeeList : employees) {
            if (employeeList.getId() == idIndex) {
                employees.remove(employeeList);
                create(employee);
                employee.setId(idIndex);
                this.idIndex--;
            }
        }

    }
}