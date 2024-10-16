package com.project.healthsync.api.dto.response;

import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.healthsync.api.annotations.PasswordValidation;
import com.project.healthsync.api.entites.User;
import com.project.healthsync.api.validationgroups.Create;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class UserResponseDTO {
	private Long id;
    
    private String firstName;
    
    private String lastName;
 
    private String email;
    
    private String phone;
    
    public UserResponseDTO(long id, String firstName, String lastName, @Email String email, String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
//    public static UserResponseDTO build(Optional<User> user) {
//
//
//        return new UserResponseDTO(
//                user.getFirstName(),
//                user.getLastName(),
//                user.getEmail(),
//                user.getPassword(),
//                user.getPhone()
//        );
//    }

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    
    
}
