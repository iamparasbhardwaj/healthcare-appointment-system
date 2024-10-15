package com.project.healthsync.api.controller.impl;

import com.project.healthsync.api.controller.IUserController;
import com.project.healthsync.api.dto.request.UserRequestDTO;
import com.project.healthsync.api.service.IUserService;
import com.project.healthsync.api.validationgroups.Create;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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
    public ResponseEntity<String> createUser(@Validated(Create.class) @RequestBody UserRequestDTO user) {
        return userService.createUser(user);
    }

    @PutMapping("/id/{id}")
    @Override
    public ResponseEntity<String> updateUser(@PathVariable String id ,@Valid @RequestBody UserRequestDTO user) {
        Long userId = Long.valueOf(id);
        return userService.updateUser(userId,user);
    }
}

