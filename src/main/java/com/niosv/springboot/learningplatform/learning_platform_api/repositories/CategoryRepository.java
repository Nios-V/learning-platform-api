package com.niosv.springboot.learningplatform.learning_platform_api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niosv.springboot.learningplatform.learning_platform_api.models.Category;

public interface CategoryRepository extends JpaRepository<Category, UUID> {

}
