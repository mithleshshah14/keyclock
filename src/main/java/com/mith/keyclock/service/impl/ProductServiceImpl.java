package com.mith.keyclock.service.impl;

import com.mith.keyclock.dto.Product;
import com.mith.keyclock.entity.ProductEntity;
import com.mith.keyclock.mapper.ProductMapper;
import com.mith.keyclock.repository.ProductRepository;
import com.mith.keyclock.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @author mithl
 * @date 26-06-2024
 * @email mithleshshah84@gmail.com
 */
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public String addProduct(Product product) {
        ProductEntity productEntity = productMapper.convertProduct(product);
        productRepository.save(productEntity);
        return "Product Created successfully";
    }
}