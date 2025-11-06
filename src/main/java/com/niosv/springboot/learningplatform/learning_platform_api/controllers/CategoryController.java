package com.niosv.springboot.learningplatform.learning_platform_api.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niosv.springboot.learningplatform.learning_platform_api.models.Category;
import com.niosv.springboot.learningplatform.learning_platform_api.services.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController extends BaseController<Category, UUID> {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        super(categoryService);
        this.categoryService = categoryService;
    }

    
}
