package com.mith.keyclock.service;

import com.mith.keyclock.dto.CartDTO;
import com.mith.keyclock.dto.CartItemDTO;
import com.mith.keyclock.response.CartResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author mithl
 * @date 28-06-2024
 * @email mithleshshah84@gmail.com
 */
@Service
public interface CartService {

    CartResponse createCart(CartDTO cartDTO);
    CartResponse getCart(UUID cartId);
    void addItemToCart(UUID cartId, CartItemDTO cartItemDTO);
    void removeItemFromCart(UUID cartId, UUID productId);

}
