package com.amaris.employees.model;

import java.security.InvalidParameterException;

public class Id {
    private final Integer value;


    public Id(Integer value) {

        if (value == null){
            throw new InvalidParameterException("Id must be greater than 0.");
        }

        this.value = value;
    }

    public static Id of(Integer value){ return new Id(value);}

    public Integer getValue() {
        return value;
    }
}
