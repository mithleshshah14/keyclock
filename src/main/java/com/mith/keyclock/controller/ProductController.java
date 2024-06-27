package com.mith.keyclock.controller;

import com.mith.keyclock.dto.Product;
import com.mith.keyclock.response.ProductResponse;
import com.mith.keyclock.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author mithl
 * @date 25-06-2024
 * @email mithleshshah84@gmail.com
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping("/addProduct")
    public ResponseEntity<String> addProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService.addProduct(product));
    }

    @GetMapping("/getProduct/all")
    public ResponseEntity<List<ProductResponse>> getProduct() {
        return ResponseEntity.ok(productService.getProducts());
    }

}
