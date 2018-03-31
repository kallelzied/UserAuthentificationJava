package com.code.street.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @author Zied Kallel
 */
public class PasswordChecker {

    //CREDENTIAL_PATTERN : minimum 8 characters at least 1 uppercase, 1 lowercase, 1 number and 1 special character
    private static final String CREDENTIAL_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}";

    private static final Pattern pattern = compile(CREDENTIAL_PATTERN);

    public static boolean isValid(String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
