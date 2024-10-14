package com.project.healthsync.api.controller;

import com.project.healthsync.api.dto.request.UserRequestDTO;
import org.springframework.http.ResponseEntity;

public interface IUserController {
    public ResponseEntity<String> createUser(UserRequestDTO user);
}
