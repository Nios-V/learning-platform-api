package com.niosv.springboot.learningplatform.learning_platform_api.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niosv.springboot.learningplatform.learning_platform_api.models.User;
import com.niosv.springboot.learningplatform.learning_platform_api.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController extends BaseController<User, UUID> {

    private final UserService userService;

    public UserController(UserService userService) {
        super(userService);
        this.userService = userService;
    }

}
