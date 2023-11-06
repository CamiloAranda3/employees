package com.amaris.employees.model;


import com.amaris.employees.model.common.StringUtils;

import java.security.InvalidParameterException;

public class Employee_name {

    private final String value;

    public Employee_name(String value){

            if(StringUtils.isEmpty(value)){
                throw new InvalidParameterException("Employee_name must have a value");
            }
            this.value = value;
    }

    public static Employee_name of(String value ){ return new Employee_name(value);}

    public String getValue() {
        return value;
    }
}
