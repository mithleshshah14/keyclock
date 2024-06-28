package com.mith.keyclock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author mithl
 * @date 28-06-2024
 * @email mithleshshah84@gmail.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartDTO {

    public List<CartItemDTO> items;


}
