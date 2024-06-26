package com.mith.keyclock.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mithl
 * @date 26-06-2024
 * @email mithleshshah84@gmail.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String name;

    private double price;

    private String styleCode;

    private String type;

}
