package com.niosv.springboot.learningplatform.learning_platform_api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.niosv.springboot.learningplatform.learning_platform_api.models.Lesson;
import com.niosv.springboot.learningplatform.learning_platform_api.repositories.LessonRepository;

@Service
public class LessonService extends BaseServiceImpl<Lesson, UUID>{

    private final LessonRepository lessonRepository;

    public LessonService(LessonRepository lessonRepository) {
        super(lessonRepository);
        this.lessonRepository = lessonRepository;
    }

}
