package com.project.healthsync.api.service;

import com.project.healthsync.api.dto.request.AuthRequestDTO;
import com.project.healthsync.api.dto.request.UserRequestDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

public interface IUserService {
    ResponseEntity<String> createUser(UserRequestDTO user);

    ResponseEntity<String> updateUser(Long userId, UserRequestDTO userRequest);

    ResponseEntity<String> auth(@Valid AuthRequestDTO auth);
}
