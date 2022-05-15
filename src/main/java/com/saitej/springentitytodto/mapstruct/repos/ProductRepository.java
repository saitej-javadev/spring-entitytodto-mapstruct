package com.saitej.springentitytodto.mapstruct.repos;


import com.saitej.springentitytodto.mapstruct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
