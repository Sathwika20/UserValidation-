package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidateEmailTest {

    private final  String emailToTest;
    private final boolean expectedResult;

    public ValidateEmailTest(String emailToTest, boolean expectedResult) {
        this.emailToTest = emailToTest;
        this.expectedResult = expectedResult;

     }
     @SuppressWarnings("rawtypes")
     @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(
                new Object[][]{
                {"sample@email.com",true},
                {"abc@yahoo.com",true},
                        {"abc-100@yahoo.com",true},
                        {"abc.100@yahoo.com",true},
                        {"abc111@abc.com",true},
                        {"abc-100@abc.net",true},
                        {"abc.100@abc.com.au",true},
                        {"abc@1.com",true},
                        {"abc@gmail.com.com",true},
                        {"abc+100@gmail.com",true}
                    }
        );
    }

    @Test
    public void testValidEmailPatterns_with_valid_email_should_return_true() {
        ValidateEmail validateEmail = new ValidateEmail();
        boolean actualResult = validateEmail.validate(this.emailToTest);
        Assert.assertEquals("Email should be in valid format",expectedResult, actualResult);

    }


}



