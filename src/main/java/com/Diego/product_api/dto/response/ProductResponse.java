package com.Diego.product_api.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResponse {
    private Long id;
    private String name;
    private Double price;
    private String categoryName;
}