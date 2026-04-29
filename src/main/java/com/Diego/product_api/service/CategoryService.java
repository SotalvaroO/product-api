package com.Diego.product_api.service;

import com.Diego.product_api.dto.request.CategoryRequest;
import com.Diego.product_api.dto.response.CategoryResponse;
import com.Diego.product_api.entity.Category;
import com.Diego.product_api.mapper.CategoryMapper;
import com.Diego.product_api.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<CategoryResponse> getAll() {
        return categoryRepository.findAll()
                .stream()
                .map(CategoryMapper::toResponse)
                .toList();
    }

    public CategoryResponse getById(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow();
        return CategoryMapper.toResponse(category);
    }

    public CategoryResponse save(CategoryRequest request) {
        Category category = CategoryMapper.toEntity(request);
        return CategoryMapper.toResponse(categoryRepository.save(category));
    }

    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }
}