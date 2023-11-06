package com.amaris.employees.controller;

import com.amaris.employees.model.Employee;
import com.amaris.employees.model.Employees;
import com.amaris.employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public Employees getAllEmployees(){
        return employeeService.findAllEmployeesComplete();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") Integer id){
        return employeeService.ObjectEmployeeById(id);
    }
}
