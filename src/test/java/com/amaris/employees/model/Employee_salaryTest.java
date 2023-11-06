package com.amaris.employees.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

public class Employee_salaryTest {
    @Test
    void Employee_testCorrect() {

        //Arrange
        String employee_salaryTest = "T";

        //Act
        Employee_salary employee_salary = new Employee_salary(employee_salaryTest);
        String currentlyEmployee_salary = Employee_salary.of(employee_salaryTest).getValue();

        //Assert
        Assertions.assertNotNull(currentlyEmployee_salary);
        Assertions.assertEquals(currentlyEmployee_salary, employee_salaryTest);
    }

    @Test
    void Employee_salaryIsNull() {

        //Arrange
        String expectedEmployee_salary = null;

        //Act
        InvalidParameterException thrown = Assertions.assertThrows(
                InvalidParameterException.class,
                () -> Employee_salary.of(expectedEmployee_salary),
                "Employee Salary must have a value"
        );

        //Assert
        Assertions.assertEquals(thrown.getClass(), InvalidParameterException.class);
        Assertions.assertTrue(thrown.getMessage().contains("Employee Salary must have a value"));

    }
}
