package com.amaris.employees.service;

import com.amaris.employees.model.Employee;
import com.amaris.employees.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {

    @Autowired
    private RestTemplate template = new RestTemplate();

    String uri = "http://dummy.restapiexample.com/api/v1/employees";

    public Employees findAllEmployeesComplete(){
        return template.getForObject(uri,Employees.class);

    }

    public Employee ObjectEmployeeById(Integer id){

        return template.getForObject(uri+ id, Employee.class);
    }

}
