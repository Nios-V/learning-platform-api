package com.niosv.springboot.learningplatform.learning_platform_api.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niosv.springboot.learningplatform.learning_platform_api.models.Role;
import com.niosv.springboot.learningplatform.learning_platform_api.services.RoleService;

@RestController
@RequestMapping("/api/roles")
public class RoleController extends BaseController<Role, UUID>{

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        super(roleService);
        this.roleService = roleService;
    }

}
