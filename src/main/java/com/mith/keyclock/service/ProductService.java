package com.mith.keyclock.service;

import com.mith.keyclock.dto.Product;
import org.springframework.stereotype.Service;

/**
 * @author mithl
 * @date 26-06-2024
 * @email mithleshshah84@gmail.com
 */
@Service
public interface ProductService {

    String addProduct(Product product);
}
