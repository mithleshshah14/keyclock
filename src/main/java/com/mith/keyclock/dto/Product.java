package com.mith.keyclock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
public class Product {

    public String name;

    public double price;

    public String styleCode;

    public String type;

}
