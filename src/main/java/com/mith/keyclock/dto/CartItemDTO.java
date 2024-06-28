package com.mith.keyclock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author mithl
 * @date 28-06-2024
 * @email mithleshshah84@gmail.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartItemDTO {

    public UUID productId;

    public int quantity;

}
