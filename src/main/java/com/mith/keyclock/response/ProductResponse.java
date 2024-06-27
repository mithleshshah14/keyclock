package com.mith.keyclock.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author mithl
 * @date 26-06-2024
 * @email mithleshshah84@gmail.com
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    private UUID id;

    private String name;

    private double price;

    private String styleCode;

    private String type;
}
