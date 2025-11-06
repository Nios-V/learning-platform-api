package com.niosv.springboot.learningplatform.learning_platform_api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.niosv.springboot.learningplatform.learning_platform_api.models.Role;
import com.niosv.springboot.learningplatform.learning_platform_api.repositories.RoleRepository;

@Service
public class RoleService extends BaseServiceImpl<Role, UUID> {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        super(roleRepository);
        this.roleRepository = roleRepository;
    }

}
