package com.mith.keyclock.mapper;

import com.mith.keyclock.dto.Product;
import com.mith.keyclock.entity.ProductEntity;
import org.mapstruct.Mapper;

/**
 * @author mithl
 * @date 26-06-2024
 * @email mithleshshah84@gmail.com
 */
@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductEntity convertProduct(Product product);

}
