package com.project.healthsync.api.service.impl;

import com.project.healthsync.api.commons.CommonMethods;
import com.project.healthsync.api.dao.UserDao;
import com.project.healthsync.api.dto.request.UserRequestDTO;
import com.project.healthsync.api.entites.User;
import com.project.healthsync.api.service.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Service
public class UserServiceImpl implements IUserService {

    private UserDao userDao;

    UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public ResponseEntity<String> createUser(UserRequestDTO userRequest) {
        User user = populateAndSaveUser(userRequest.getFirstName(), userRequest.getLastName(), userRequest.getEmail(), CommonMethods.generatePasswordHash(userRequest.getPassword()), userRequest.getPhone(), null);
        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri()).build();
    }

    @Override
    public ResponseEntity<String> updateUser(Long userId, UserRequestDTO userRequest) {
        User user = this.userDao.getById(userId);
        user = populateAndSaveUser(userRequest.getFirstName(), userRequest.getLastName(), userRequest.getEmail(), userRequest.getPassword(), userRequest.getPhone(), user);
        return ResponseEntity.noContent().build();
    }

    private User populateAndSaveUser(String firstName, String lastName, String email, String password, String phone, User user) {
        if (user == null) {
            user = new User();
        }
        if (firstName != null)
            user.setFirstName(firstName);
        if (lastName != null)
            user.setLastName(lastName);
        if (email != null)
            user.setEmail(email);
        if (password != null)
            user.setPassword(CommonMethods.generatePasswordHash(password));
        if (phone != null)
            user.setPhone(phone);
        return this.userDao.save(user);
    }
}
