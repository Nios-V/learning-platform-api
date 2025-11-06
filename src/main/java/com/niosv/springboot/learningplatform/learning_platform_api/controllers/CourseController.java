package com.niosv.springboot.learningplatform.learning_platform_api.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niosv.springboot.learningplatform.learning_platform_api.models.Course;
import com.niosv.springboot.learningplatform.learning_platform_api.services.CourseService;

@RestController
@RequestMapping("/api/courses")
public class CourseController extends BaseController<Course, UUID> {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        super(courseService);
        this.courseService = courseService;
    }

}
