package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


 public class UserRegistrationValidationTest {

     @Test
     public void given_first_name_check_true() throws UserRegistrationException {
         UserRegistrationValidation user = new UserRegistrationValidation();
         boolean result = user.validateFirstname("Sathwika");
         Assert.assertTrue(result);
     }

     @Test
     public void given_first_name_check_false() {
         UserRegistrationValidation user = new UserRegistrationValidation();
         boolean result = false;
         try {
             result = user.validateFirstname("sathwika");
         } catch (UserRegistrationException e) {
             System.out.println(" exception");
         }
         Assert.assertFalse(result);
     }

     @Test
     public void given_last_name_check_true() throws UserRegistrationException{
         UserRegistrationValidation user = new UserRegistrationValidation();
         boolean result = user.validateLastName("Gopiraj");
         Assert.assertTrue(result);
     }

     @Test
     public void given_last_name_check_false() {
         UserRegistrationValidation user = new UserRegistrationValidation();
         boolean result = false;
         try {
             result = user.validateLastName("gopiraj");
         } catch (UserRegistrationException e) {
             System.out.println(" exception");
         }
         Assert.assertFalse(result);
     }

     @Test
     public void given_check_email_true() throws UserRegistrationException {
         UserRegistrationValidation user = new UserRegistrationValidation();
         boolean result = user.validateEmail("abc.xyz@bl.co.in");
         Assert.assertTrue(result);
     }

     @Test
     public void given_check_email_false() {
         UserRegistrationValidation user = new UserRegistrationValidation();
         boolean result = false;
         try {
             result = user.validateEmail("gopiraj@gmail.com");
         } catch ( UserRegistrationException e) {
             System.out.println(" exception");
         }
         Assert.assertFalse(result);
     }

     @Test
     public void given_check_mobile_number_true() throws UserRegistrationException {
         UserRegistrationValidation user = new UserRegistrationValidation();
         boolean result = user.validateMobileNumber("91 7989216041");
         Assert.assertTrue(result);
     }

     @Test
     public void given_check_mobile_number_false() {
         UserRegistrationValidation user = new UserRegistrationValidation();
         boolean result = false;
         try {
             result = user.validateMobileNumber("090208");
         } catch (UserRegistrationException e) {
             System.out.println(" exception");
         }
         Assert.assertFalse(result);
     }

     @Test
     public void given_check_password_true() throws UserRegistrationException {
         UserRegistrationValidation user = new UserRegistrationValidation();
         boolean result = user.validatePassword("SATH@200");
         Assert.assertTrue(result);
     }

     @Test
     public void given_check_password_false() {
         UserRegistrationValidation user = new UserRegistrationValidation();
         boolean result = false;
         try {
             result = user.validatePassword("abcd");
         } catch ( UserRegistrationException e) {
             System.out.println(" exception");
         }
         Assert.assertFalse(result);
     }

 }





