package com.mith.keyclock.entity;

import jakarta.persistence.*;
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
@Entity(name = "cart-item")
@Builder
public class CartItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false, referencedColumnName = "id")
    private CartEntity cart;


    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false, referencedColumnName = "id")
    public ProductEntity product;

    public int quantity;

}
