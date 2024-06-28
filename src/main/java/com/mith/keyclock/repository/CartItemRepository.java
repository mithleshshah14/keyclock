package com.mith.keyclock.repository;

import com.mith.keyclock.entity.CartItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author mithl
 * @date 28-06-2024
 * @email mithleshshah84@gmail.com
 */
@Repository
public interface CartItemRepository extends JpaRepository<CartItemEntity, UUID> {
}
