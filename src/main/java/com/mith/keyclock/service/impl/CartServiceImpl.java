package com.mith.keyclock.service.impl;

import com.mith.keyclock.dto.CartDTO;
import com.mith.keyclock.dto.CartItemDTO;
import com.mith.keyclock.response.CartResponse;
import com.mith.keyclock.service.CartService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author mithl
 * @date 28-06-2024
 * @email mithleshshah84@gmail.com
 */
@Service
public class CartServiceImpl implements CartService {
    @Override
    public CartResponse createCart(CartDTO cartDTO) {
        return null;
    }

    @Override
    public CartResponse getCart(UUID cartId) {
        return null;
    }

    @Override
    public void addItemToCart(UUID cartId, CartItemDTO cartItemDTO) {

    }

    @Override
    public void removeItemFromCart(UUID cartId, UUID productId) {

    }
}
