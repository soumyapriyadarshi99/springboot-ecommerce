package com.productservice.Mapper;

import com.productservice.dto.ProductResponse;
import com.productservice.model.Product;

public class ProductMapper {
    public static ProductResponse mapToProductResponse(Product product){
        return ProductResponse.builder().id(product.getId()).name(product.getName()).price(product.getPrice()).description(product.getDescription()).build();
    }
}
