package com.amaris.employees.model;

import com.amaris.employees.model.common.StringUtils;

import java.security.InvalidParameterException;

public class Profile_image {
    private final String value;

    public Profile_image(String value){

        if(StringUtils.isEmpty(value)){
            throw new InvalidParameterException("Profile image must have a value");
        }

        this.value = value;
    }

    public static Profile_image of(String value){return new Profile_image(value);}

    public String getValue() {
        return value;
    }
}
