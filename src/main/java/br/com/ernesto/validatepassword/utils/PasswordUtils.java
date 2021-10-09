package br.com.ernesto.validatepassword.utils;

import java.util.regex.Pattern;

public class PasswordUtils {

    /**
     * Regular expression that validates the requirements below:
     * Nine or more characters
     * At least 1 digit
     * At least 1 lowercase letter
     * At least 1 capital letter
     * At least 1 special character
     * Characters as special:! @ # $% ^ & * () - +
     * There are no repeated characters within the set
     */
    public static final Pattern regexValidate = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])(?:([0-9a-zA-Z!@#$%^&*()-+])(?!.*\\1)){9,}$");
}
