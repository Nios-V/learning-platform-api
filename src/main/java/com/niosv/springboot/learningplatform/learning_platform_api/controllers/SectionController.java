package com.niosv.springboot.learningplatform.learning_platform_api.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niosv.springboot.learningplatform.learning_platform_api.models.Section;
import com.niosv.springboot.learningplatform.learning_platform_api.services.SectionService;

@RestController
@RequestMapping("/api/sections")
public class SectionController extends BaseController<Section, UUID>{

    private final SectionService sectionService;

    public SectionController(SectionService sectionService) {
        super(sectionService);
        this.sectionService = sectionService;
    }

}
