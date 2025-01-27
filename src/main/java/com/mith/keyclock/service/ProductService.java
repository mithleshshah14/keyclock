package com.mith.keyclock.service;

import com.mith.keyclock.dto.ProductDTO;
import com.mith.keyclock.response.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mithl
 * @date 26-06-2024
 * @email mithleshshah84@gmail.com
 */
@Service
public interface ProductService {

    String addProduct(ProductDTO productDTO);
    List<ProductResponse> getProducts();
}
