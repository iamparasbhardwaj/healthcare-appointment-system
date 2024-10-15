package com.project.healthsync.api.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * Custom validator for Password.
 */
public class PasswordValidator implements ConstraintValidator<PasswordValidation, String> {
    // Regex for password
    private final String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";

    /**
     * Method to validate password against regex.
     *
     * @param password
     * @param cxt
     * @return
     */
    public boolean isValid(String password, ConstraintValidatorContext cxt) {
        if (password != null)
            return password.matches(this.pattern);
        return Boolean.TRUE;
    }
}
