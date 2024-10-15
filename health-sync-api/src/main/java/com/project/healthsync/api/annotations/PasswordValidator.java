package com.project.healthsync.api.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<PasswordValidation, String>
{
    private final String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
    public boolean isValid(String password, ConstraintValidatorContext cxt) {
        if(password!=null)
            return password.matches(this.pattern);
        return Boolean.TRUE;
    }
}
