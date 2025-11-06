package com.niosv.springboot.learningplatform.learning_platform_api.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.niosv.springboot.learningplatform.learning_platform_api.models.Category;
import com.niosv.springboot.learningplatform.learning_platform_api.repositories.CategoryRepository;

@Service
public class CategoryService extends BaseServiceImpl<Category, UUID> {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        super(categoryRepository);
        this.categoryRepository = categoryRepository;
    }

}
