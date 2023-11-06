package com.amaris.employees.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.expression.spel.ast.Identifier;

import java.security.InvalidParameterException;

public class IdTest {

    @Test
    void idTestIsValid() {

        //Arrange
        Integer expectedId = Integer.valueOf(10);

        //Act
        Id.of(expectedId);
        Integer actualIdentifier = Id.of(expectedId).getValue();

        //Assert
        Assertions.assertNotNull(actualIdentifier);
        Assertions.assertEquals(actualIdentifier, expectedId);

    }

    @Test
    void idTestIsNull() {

        //Arrange
        Integer expectedId = null;

        //Act
        InvalidParameterException thrown = Assertions.assertThrows(
                InvalidParameterException.class,
                () -> Id.of(expectedId)
        );

        //Assert
        Assertions.assertEquals(thrown.getClass(), InvalidParameterException.class);
        Assertions.assertTrue(thrown.getMessage().contains("Id must be greater than 0"));

    }
}
