package com.project.healthsync.api.dto.request;

import com.project.healthsync.api.annotations.PasswordValidation;
import com.project.healthsync.api.validationgroups.Create;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class UserRequestDTO {
    @NotNull(groups = Create.class)
    private String firstName;
    @NotNull(groups = Create.class)
    private String lastName;
    @NotNull(groups = Create.class)
    @PasswordValidation
    private String password;
    @NotNull(groups = Create.class)
    @Email
    private String email;
    @NotNull(groups = Create.class)
    private String phone;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone( String phone) {
        this.phone = phone;
    }
}
