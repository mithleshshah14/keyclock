package com.mith.keyclock.mapper;

import com.mith.keyclock.dto.Product;
import com.mith.keyclock.entity.ProductEntity;
import com.mith.keyclock.response.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author mithl
 * @date 26-06-2024
 * @email mithleshshah84@gmail.com
 */
@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductEntity convertProduct(Product product);

    ProductResponse entityToResponse(ProductEntity productEntity);

}
