package com.amaris.employees.model;

import com.amaris.employees.model.common.StringUtils;

import java.security.InvalidParameterException;

public class Employee_age {
    private final String value;

    public Employee_age(String value){
           if(StringUtils.isEmpty(value)){
               throw new InvalidParameterException("Employee age must have a value");
           }

           this.value = value;
    }

    public static Employee_age of(String value){ return new Employee_age(value);}

    public String getValue() {
        return value;
    }
}
