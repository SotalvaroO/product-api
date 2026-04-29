package com.Diego.product_api.service;

import com.Diego.product_api.dto.request.ProductRequest;
import com.Diego.product_api.dto.response.ProductResponse;
import com.Diego.product_api.entity.Product;
import com.Diego.product_api.mapper.ProductMapper;
import com.Diego.product_api.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductResponse> getAll() {
        return productRepository.findAll()
                .stream()
                .map(ProductMapper::toResponse)
                .toList();
    }

    public ProductResponse getById(Long id) {
        Product product = productRepository.findById(id).orElseThrow();
        return ProductMapper.toResponse(product);
    }

    public ProductResponse save(ProductRequest request) {
        Product product = ProductMapper.toEntity(request);
        return ProductMapper.toResponse(productRepository.save(product));
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}