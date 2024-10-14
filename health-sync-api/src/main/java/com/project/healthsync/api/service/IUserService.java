package com.project.healthsync.api.service;

import com.project.healthsync.api.dto.request.UserRequestDTO;
import org.springframework.http.ResponseEntity;

public interface IUserService {
    ResponseEntity<String> saveUser(UserRequestDTO user);
}
