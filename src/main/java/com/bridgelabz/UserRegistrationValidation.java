package com.bridgelabz;

import java.util.regex.Pattern;



public class UserRegistrationValidation {


    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    private static final String EMAIL = "^abc.[a-z]{1,}.[(xyz)?=n(in)]?@bl.co.[a-z]{2,3}$";
    private static final String MOBILE_NUMBER = "^[0-9]{1,2}[ ][0-9]{10}$";
    private static final String PASSWORD = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";

    public  boolean validateFirstname(String firstname) throws UserRegistrationException {
    Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
    if(!pattern.matcher(firstname).matches()){
        throw new UserRegistrationException ("first name should match the given pattern");
    }
    return pattern.matcher(firstname).matches();
    }

    public boolean validateLastName(String lastname) throws UserRegistrationException {
    Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
    if(!pattern.matcher(lastname).matches()){
        throw new UserRegistrationException ("last name should match the given pattern");
    }
    return pattern.matcher(lastname).matches();
    }

    public boolean validateEmail(String email) throws UserRegistrationException {
    Pattern pattern = Pattern.compile(EMAIL);
    if(!pattern.matcher(email).matches()){
        throw new UserRegistrationException ("email should match the given pattern");
    }
    return pattern.matcher(email).matches();
    }


    public boolean validateMobileNumber(String mobilenumber ) throws UserRegistrationException  {
     Pattern pattern = Pattern.compile(MOBILE_NUMBER);
     if(!pattern.matcher(mobilenumber).matches()){
         throw new UserRegistrationException("mobile number should match the given pattern");
     }
     return pattern.matcher(mobilenumber).matches();
    }

    public boolean validatePassword(String password) throws UserRegistrationException {
    Pattern pattern = Pattern.compile(PASSWORD);
    if(!pattern.matcher(password).matches()){
        throw new UserRegistrationException("password should match the given pattern");
    }
    return pattern.matcher(password).matches();
    }

}
