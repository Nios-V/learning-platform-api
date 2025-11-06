package com.niosv.springboot.learningplatform.learning_platform_api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.niosv.springboot.learningplatform.learning_platform_api.models.Section;
import com.niosv.springboot.learningplatform.learning_platform_api.repositories.SectionRepository;

@Service
public class SectionService extends BaseServiceImpl<Section, UUID> {

    private final SectionRepository sectionRepository;

    public SectionService(SectionRepository sectionRepository) {
        super(sectionRepository);
        this.sectionRepository = sectionRepository;
    }

}
