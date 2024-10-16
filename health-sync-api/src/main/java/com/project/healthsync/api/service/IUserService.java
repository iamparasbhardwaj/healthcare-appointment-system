package com.project.healthsync.api.service;

import org.springframework.http.ResponseEntity;

import com.project.healthsync.api.dto.request.UserRequestDTO;

public interface IUserService {
    ResponseEntity<String> createUser(UserRequestDTO user);

    ResponseEntity<String> updateUser(Long userId, UserRequestDTO userRequest);
    
    ResponseEntity<String> getUser(Long userId);
}
