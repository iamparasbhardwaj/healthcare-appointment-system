package com.project.healthsync.api.dao;

import com.project.healthsync.api.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
 //   ArrayList<User> findAllUsers();
}

