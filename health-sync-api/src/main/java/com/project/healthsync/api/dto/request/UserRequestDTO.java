package com.project.healthsync.api.dto.request;

import com.project.healthsync.api.annotations.PasswordValidation;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class UserRequestDTO {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    @PasswordValidation
    private String password;
    @NotNull
    @Email
    private String email;
    @NotNull
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
