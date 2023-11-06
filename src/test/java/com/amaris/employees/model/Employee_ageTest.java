package com.amaris.employees.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

public class Employee_ageTest {

    @Test
    void Employee_ageTestCorrect() {

        //Arrange
        String employee_ageTest = "T";

        //Act
        Employee_age employee_age = new Employee_age(employee_ageTest);
        String currentlyEmployee_age = Employee_salary.of(employee_ageTest).getValue();

        //Assert
        Assertions.assertNotNull(currentlyEmployee_age);
        Assertions.assertEquals(currentlyEmployee_age, employee_ageTest);
    }

    @Test
    void Employee_salaryIsNull() {

        //Arrange
        String expectedEmployee_age = null;

        //Act
        InvalidParameterException thrown = Assertions.assertThrows(
                InvalidParameterException.class,
                () -> Employee_age.of(expectedEmployee_age),
                "Employee age must have a value"
        );

        //Assert
        Assertions.assertEquals(thrown.getClass(), InvalidParameterException.class);
        Assertions.assertTrue(thrown.getMessage().contains("Employee age must have a value"));

    }
}
