package com.Diego.product_api.mapper;

import com.Diego.product_api.dto.request.CategoryRequest;
import com.Diego.product_api.dto.response.CategoryResponse;
import com.Diego.product_api.entity.Category;

public class CategoryMapper {

    public static CategoryResponse toResponse(Category category) {
        CategoryResponse response = new CategoryResponse();
        response.setId(category.getId());
        response.setName(category.getName());
        return response;
    }

    public static Category toEntity(CategoryRequest request) {
        return Category.builder()
                .name(request.getName())
                .build();
    }
}