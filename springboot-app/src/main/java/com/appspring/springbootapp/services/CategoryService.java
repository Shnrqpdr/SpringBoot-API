package com.appspring.springbootapp.services;

import com.appspring.springbootapp.repositories.CategoryRepository;

import java.util.List;
import java.util.Optional;

import com.appspring.springbootapp.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}

