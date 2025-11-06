package com.niosv.springboot.learningplatform.learning_platform_api.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niosv.springboot.learningplatform.learning_platform_api.models.Enrollment;
import com.niosv.springboot.learningplatform.learning_platform_api.services.EnrollmentService;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController extends BaseController<Enrollment, UUID> {

    private final EnrollmentService enrollmentService;

    public EnrollmentController(EnrollmentService enrollmentService) {
        super(enrollmentService);
        this.enrollmentService = enrollmentService;
    }

}
