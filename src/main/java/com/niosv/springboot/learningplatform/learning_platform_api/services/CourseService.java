package com.niosv.springboot.learningplatform.learning_platform_api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.niosv.springboot.learningplatform.learning_platform_api.models.Course;
import com.niosv.springboot.learningplatform.learning_platform_api.repositories.CourseRepository;

@Service
public class CourseService extends BaseServiceImpl<Course, UUID> {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        super(courseRepository);
        this.courseRepository = courseRepository;
    }

}
