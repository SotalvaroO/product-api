package com.Diego.product_api.dto.request;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private Double price;
    private Long categoryId;
}