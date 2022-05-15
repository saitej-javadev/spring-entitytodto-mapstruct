package com.saitej.springentitytodto.mapstruct.mapper;


import com.saitej.springentitytodto.mapstruct.dto.ProductDTO;
import com.saitej.springentitytodto.mapstruct.model.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toProductDTO(Product product);
    @InheritInverseConfiguration
    Product toProduct(ProductDTO productDTO);

}
