package com.niosv.springboot.learningplatform.learning_platform_api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.niosv.springboot.learningplatform.learning_platform_api.models.Enrollment;
import com.niosv.springboot.learningplatform.learning_platform_api.repositories.EnrollmentRepository;

@Service
public class EnrollmentService extends BaseServiceImpl<Enrollment, UUID> {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentService(EnrollmentRepository enrollmentRepository) {
        super(enrollmentRepository);
        this.enrollmentRepository = enrollmentRepository;
    }

}
