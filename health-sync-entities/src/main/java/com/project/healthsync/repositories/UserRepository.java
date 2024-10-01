package com.project.healthsync.repositories;

import com.project.healthsync.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;



    @Repository
    public interface UserRepository extends JpaRepository<User, Long> {
        ArrayList<User> findAllUsers();
}
