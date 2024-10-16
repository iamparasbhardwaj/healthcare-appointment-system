package com.project.healthsync.api.controller;

import org.springframework.http.ResponseEntity;

import com.project.healthsync.api.dto.request.UserRequestDTO;

public interface IUserController {
    public ResponseEntity<String> createUser(UserRequestDTO user);
    public ResponseEntity<String> updateUser(String id , UserRequestDTO user);
	public ResponseEntity<String> getUser(String id);
	
}
