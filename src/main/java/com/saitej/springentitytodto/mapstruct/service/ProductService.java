package com.saitej.springentitytodto.mapstruct.service;


import com.saitej.springentitytodto.mapstruct.dto.ProductDTO;

public interface ProductService {
   /* without DTO pattern*/

   /* Product saveProduct(Product product);
    Product findById(Long id);
    Product updateProduct(Product product);
    String deleteById(Long id);*/

  /* with DTO pattern*/

   ProductDTO saveProduct(ProductDTO productDTO);
   ProductDTO findById(Long id);
   ProductDTO updateProduct(ProductDTO productDTO);
   String DeleteById(Long id);
}
