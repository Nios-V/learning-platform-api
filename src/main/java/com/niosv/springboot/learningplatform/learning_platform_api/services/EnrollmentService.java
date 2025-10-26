package com.niosv.springboot.learningplatform.learning_platform_api.services;

import org.springframework.stereotype.Service;

import com.niosv.springboot.learningplatform.learning_platform_api.repositories.EnrollmentRepository;

@Service
public class EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentService(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

}
