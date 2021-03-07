package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


 public class UserRegistrationValidationTest {

     @Test
 public void given_first_name_check_true() {
     UserRegistrationValidation user = new UserRegistrationValidation();
         boolean result = false;
         try {
             result = user.validateFirstname( "Sathwika");
         } catch (InvalidFirstNameException e ) {
             System.out.println(" exception");
         }
         Assert.assertTrue(result);
 }
 @Test
 public void given_first_name_check_false() {
     UserRegistrationValidation user = new UserRegistrationValidation();
     boolean result = false;
     try {
         result = user.validateFirstname("sathwika");
     } catch (InvalidFirstNameException e) {
         System.out.println(" exception");
     }
     Assert.assertFalse(result);
 }
 @Test
  public void given_last_name_check_true() {
      UserRegistrationValidation user = new UserRegistrationValidation();
     boolean result = false;
     try {
         result = user.validateLastName("Gopiraj");
     } catch (InvalidLastNameException e) {
          System.out.println(" exception");
     }
     Assert.assertTrue(result);
 }
 @Test
  public void given_last_name_check_false() {
     UserRegistrationValidation user = new UserRegistrationValidation();
     boolean result = false;
     try {
         result = user.validateLastName("gopiraj");
     } catch (InvalidLastNameException e) {
         System.out.println(" exception");
     }
     Assert.assertFalse(result);
 }
 @Test
  public void given_check_email_true() {
   UserRegistrationValidation user = new UserRegistrationValidation();
     boolean result = false;
     try {
         result = user.validateEmail("abc.xyz@bl.co.in");
     } catch (InvalidEmailException e) {
         System.out.println(" exception");
     }
     Assert.assertTrue(result);
 }
 @Test
 public void given_check_email_false() {
   UserRegistrationValidation user = new UserRegistrationValidation();
     boolean result = false;
     try {
         result = user.validateEmail("gopiraj@gmail.com");
     } catch (InvalidEmailException e) {
         System.out.println(" exception");
     }
     Assert.assertFalse(result);
 }
 @Test
  public void given_check_mobile_number_true() {
  UserRegistrationValidation user = new UserRegistrationValidation();
     boolean result = false;
     try {
         result = user.validateMobileNumber("91 7989216041");
     } catch (InvalidMobileNumberException e) {
         System.out.println(" exception");
     }
     Assert.assertTrue(result);
 }
 @Test
  public void given_check_mobile_number_false() {
   UserRegistrationValidation user = new UserRegistrationValidation();
     boolean result = false;
     try {
         result = user.validateMobileNumber("345789034589");
     } catch (InvalidMobileNumberException e) {
         System.out.println(" exception");
     }
     Assert.assertFalse(result);
 }

 @Test
 public void given_check_password_true() {
     UserRegistrationValidation user = new UserRegistrationValidation();
     boolean result = false;
     try {
         result = user.validatePassword("SATH@200");
     } catch (InvalidPasswordException e) {
         System.out.println(" exception");
     }
     Assert.assertTrue(result);
 }

  @Test
     public void given_check_password_false() {
     UserRegistrationValidation user = new UserRegistrationValidation();
      boolean result = false;
      try {
          result = user.validatePassword("abcd");
      } catch (InvalidPasswordException e) {
          System.out.println(" exception");
      }
      Assert.assertFalse(result);
     }
     @Test(expected = InvalidFirstNameException.class)
     public void testFirstName_invalid_first_name_exception() throws Exception{
         UserRegistrationValidation user = new UserRegistrationValidation();

         user.validateFirstname("---0099899000000");


     }
     @Test(expected = InvalidLastNameException.class)
     public void testLastName_invalid_last_name_exception() throws Exception{
         UserRegistrationValidation user = new UserRegistrationValidation();
         user.validateLastName("099789473987...");

     }
     @Test(expected = InvalidEmailException.class)
     public void testEmail_invalid_email_exception() throws Exception{
         UserRegistrationValidation user = new UserRegistrationValidation();

         user.validateEmail("hdq73809");


     }
     @Test(expected = InvalidMobileNumberException.class)
     public void testMobileNumber_invalid_mobile_number_exception() throws Exception{
         UserRegistrationValidation user = new UserRegistrationValidation();

             user.validateMobileNumber("hqlkpoqiofq");

     }
     @Test(expected = InvalidPasswordException.class)
     public void testPassword_invalid_password_exception() throws Exception{
         UserRegistrationValidation user = new UserRegistrationValidation();
             user.validatePassword("rugeuih");

     }
 }
