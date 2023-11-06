package com.amaris.employees.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

public class Profile_imageTest {

    @Test
    void Profile_imageTestCorrect() {

        //Arrange
        String Profile_imageTest = "T";

        //Act
        Profile_image profile_image = new Profile_image(Profile_imageTest);
        String currentlyProfile_image = Profile_image.of(Profile_imageTest).getValue();

        //Assert
        Assertions.assertNotNull(currentlyProfile_image);
        Assertions.assertEquals(currentlyProfile_image, Profile_imageTest);
    }

    @Test
    void Profile_imageIsNull() {

        //Arrange
        String expectedProfile_image = null;

        //Act
        InvalidParameterException thrown = Assertions.assertThrows(
                InvalidParameterException.class,
                () -> Profile_image.of(expectedProfile_image),
                "Profile image must have a value"
        );

        //Assert
        Assertions.assertEquals(thrown.getClass(), InvalidParameterException.class);
        Assertions.assertTrue(thrown.getMessage().contains("Profile image must have a value"));

    }
}
