package com.ao.zeng.ordersystem.service;

import com.ao.zeng.ordersystem.model.CategoryEntity;
import com.ao.zeng.ordersystem.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author aozeng
 */
@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryEntity> findAllCategory() {
        return this.categoryRepository.findAll();
    }
}
