package com.niosv.springboot.learningplatform.learning_platform_api.services;

import org.springframework.stereotype.Service;

import com.niosv.springboot.learningplatform.learning_platform_api.repositories.RoleRepository;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

}
