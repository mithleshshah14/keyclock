package com.mith.keyclock.controller;

import com.mith.keyclock.dto.CartDTO;
import com.mith.keyclock.dto.CartItemDTO;
import com.mith.keyclock.response.CartResponse;
import com.mith.keyclock.service.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mithlesh
 * @date 25-06-2024
 * @email mithleshshah84@gmail.com
 */
@RestController()
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    public ResponseEntity<CartResponse> createCart(@RequestBody CartDTO cartDTO) {
        return ResponseEntity.ok(cartService.createCart(cartDTO));
    }


}
