package com.amaris.employees.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

public class Employee_nameTest {
    @Test
    void Employee_nameCorrect() {

        //Arrange
        String employee_nameTest = "T";

        //Act
        Employee_name employee_name = new Employee_name(employee_nameTest);
        String currentlyEmployee_name = Employee_name.of(employee_nameTest).getValue();

        //Assert
        Assertions.assertNotNull(currentlyEmployee_name);
        Assertions.assertEquals(currentlyEmployee_name, employee_nameTest);
    }
    @Test
    void Employee_nameIsNull() {

        //Arrange
        String expectedEmployee_name = null;

        //Act
        InvalidParameterException thrown = Assertions.assertThrows(
                InvalidParameterException.class,
                () -> Employee_name.of(expectedEmployee_name),
                "Employee_name must have value"
        );

        //Assert
        Assertions.assertEquals(thrown.getClass(), InvalidParameterException.class);
        Assertions.assertTrue(thrown.getMessage().contains("Employee_name must have a value"));

    }
}
