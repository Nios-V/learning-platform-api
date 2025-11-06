package com.niosv.springboot.learningplatform.learning_platform_api.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niosv.springboot.learningplatform.learning_platform_api.models.Lesson;
import com.niosv.springboot.learningplatform.learning_platform_api.services.LessonService;

@RestController
@RequestMapping("/api/lessons")
public class LessonController extends BaseController<Lesson, UUID> {

    private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        super(lessonService);
        this.lessonService = lessonService;
    }

}
