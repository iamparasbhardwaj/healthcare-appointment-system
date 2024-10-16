package com.project.healthsync.api.controller;

import com.project.healthsync.api.dto.request.AuthRequestDTO;
import com.project.healthsync.api.dto.request.UserRequestDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface IUserController {
    public ResponseEntity<String> createUser(UserRequestDTO user);
    public ResponseEntity<String> updateUser(String id , UserRequestDTO user);
    ResponseEntity<String> auth(AuthRequestDTO authRequestDTO);
	public ResponseEntity<String> getUser(String id);
	
}
