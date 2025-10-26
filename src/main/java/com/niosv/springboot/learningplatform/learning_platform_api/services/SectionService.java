package com.niosv.springboot.learningplatform.learning_platform_api.services;

import org.springframework.stereotype.Service;

import com.niosv.springboot.learningplatform.learning_platform_api.repositories.SectionRepository;

@Service
public class SectionService {

    private final SectionRepository sectionRepository;

    public SectionService(SectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository;
    }

}
