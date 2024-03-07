package com.productService.mapper;

import com.productService.dto.ProductResponse;
import com.productService.model.Product;

public class ProductMapper {
    public static ProductResponse mapToProductResponse(Product product){
        return ProductResponse.builder().id(product.getId()).name(product.getName()).price(product.getPrice()).description(product.getDescription()).build();
    }
}