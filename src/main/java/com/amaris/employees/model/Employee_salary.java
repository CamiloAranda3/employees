package com.amaris.employees.model;

import com.amaris.employees.model.common.StringUtils;

import java.security.InvalidParameterException;

public class Employee_salary {
    private final String value;

    public Employee_salary(String value){
            if(StringUtils.isEmpty(value)){
                throw new InvalidParameterException("Employee Salary must have a value");
            }

            this.value = value;
    }

    public static Employee_salary of(String value){return new Employee_salary(value);}

    public String getValue() {
        return value;
    }
}
