package com.project.healthsync.api.controller.impl;

import com.project.healthsync.api.controller.IUserController;
import com.project.healthsync.api.dto.request.UserRequestDTO;
import com.project.healthsync.api.service.IUserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController implements IUserController {
    private IUserService userService;

    UserController(@Qualifier("userServiceImpl") IUserService userService){
        this.userService = userService;
    }

    @Override
    @PostMapping
    public ResponseEntity<String> createUser(@Valid @RequestBody UserRequestDTO user) {
        return userService.saveUser(user);
    }
}

