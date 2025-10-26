package com.niosv.springboot.learningplatform.learning_platform_api.services;

import org.springframework.stereotype.Service;

import com.niosv.springboot.learningplatform.learning_platform_api.repositories.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
