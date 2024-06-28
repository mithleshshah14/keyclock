package com.mith.keyclock.repository;

import com.mith.keyclock.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author mithl
 * @date 28-06-2024
 * @email mithleshshah84@gmail.com
 */
@Repository
public interface CartRepository extends JpaRepository<CartEntity, UUID> {
}
