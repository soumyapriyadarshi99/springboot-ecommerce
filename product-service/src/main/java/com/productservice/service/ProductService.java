package com.productService.service;


import com.productService.mapper.ProductMapper;
import com.productService.dto.ProductRequest;
import com.productService.dto.ProductResponse;
import com.productService.model.Product;
import com.productService.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;


    public void createProduct(ProductRequest productRequest){
        Product product=Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);
        log.info("Product {} is saved",product.getId());
    }

    public List<ProductResponse> getAllProducts(){
        List<Product> products=productRepository.findAll();

        return products.stream().map(ProductMapper::mapToProductResponse).toList();

    }

}

