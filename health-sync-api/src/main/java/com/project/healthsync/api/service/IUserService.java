package com.project.healthsync.api.service;

import com.project.healthsync.api.dto.request.UserRequestDTO;
import org.springframework.http.ResponseEntity;

public interface IUserService {
    ResponseEntity<String> createUser(UserRequestDTO user);

    ResponseEntity<String> updateUser(Long userId, UserRequestDTO userRequest);
}
