package com.niosv.springboot.learningplatform.learning_platform_api.services;

import org.springframework.stereotype.Service;

import com.niosv.springboot.learningplatform.learning_platform_api.repositories.CategoryRepository;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

}
