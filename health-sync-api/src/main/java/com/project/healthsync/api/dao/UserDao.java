package com.project.healthsync.api.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.healthsync.api.entites.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    //ArrayList<User> findAllUsers();
    //Optional<User> findByid(Long id);
}

