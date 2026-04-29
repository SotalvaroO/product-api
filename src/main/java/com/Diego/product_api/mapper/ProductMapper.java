package com.Diego.product_api.mapper;

import com.Diego.product_api.dto.request.ProductRequest;
import com.Diego.product_api.dto.response.ProductResponse;
import com.Diego.product_api.entity.Category;
import com.Diego.product_api.entity.Product;

public class ProductMapper {

    public static ProductResponse toResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .categoryName(product.getCategory().getName())
                .build();
    }

    public static Product toEntity(ProductRequest request) {
        return Product.builder()
                .name(request.getName())
                .price(request.getPrice())
                .category(Category.builder().id(request.getCategoryId()).build())
                .build();
    }
}