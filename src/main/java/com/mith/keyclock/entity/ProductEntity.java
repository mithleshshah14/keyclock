package com.mith.keyclock.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

/**
 * @author mithl
 * @date 26-06-2024
 * @email mithleshshah84@gmail.com
 */
@Entity
@Data
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private double price;

    private String styleCode;

    private String type;
}
