package com.product.mapper;

import com.product.dto.ProductRequest;
import com.product.dto.ProductResponse;
import com.product.model.Product;

public class ProductMapper {
    public static ProductResponse mapToProductResponse(Product product){
        return ProductResponse.builder().id(product.getId()).name(product.getName()).price(product.getPrice()).description(product.getDescription()).build();
    }
    public static Product mapToProduct(ProductRequest productRequest){
        return Product.builder().name(productRequest.getName()).price(productRequest.getPrice()).description(productRequest.getDescription()).build();
    }
}