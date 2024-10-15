package com.project.healthsync.api.commons;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.SecureRandom;

public class CommonMethods {

    public static final BCryptPasswordEncoder bCryptPasswordEncoder =
            new BCryptPasswordEncoder(10, new SecureRandom());

    public static String generatePasswordHash(String plainPassword){
        return bCryptPasswordEncoder.encode(plainPassword);
    }
}
