package com.bridgelabz;


import java.util.regex.Pattern;

public class ValidateEmail {

    private static final String EMAIL_PATTERN = "^[a-z]{1,1}+[a-z0-9.+-]{1,}+@+[a-z0-9]{1,}+[.]{1,1}+[a-z0-9]{2,}(.[a-z]{2,})?$";
    public boolean validate(String email) {
        return Pattern.compile(EMAIL_PATTERN).matcher(email).matches();
    }
}
