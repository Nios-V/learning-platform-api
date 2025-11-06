package com.niosv.springboot.learningplatform.learning_platform_api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.niosv.springboot.learningplatform.learning_platform_api.models.User;
import com.niosv.springboot.learningplatform.learning_platform_api.repositories.UserRepository;

@Service
public class UserService extends BaseServiceImpl<User, UUID> {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

}
