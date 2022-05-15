package com.saitej.springentitytodto.mapstruct;

import com.saitej.springentitytodto.mapstruct.dto.ProductDTO;
import com.saitej.springentitytodto.mapstruct.model.Product;
import com.saitej.springentitytodto.mapstruct.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringEntitytodtoMapstructApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    void testCreateProduct() {


        ProductDTO productDTO = new ProductDTO();
        productDTO.setName("RealMe");
        productDTO.setDescription("From RealMe Inc..");
        productDTO.setPrice(500.0);
        ProductDTO savedProduct = productService.saveProduct(productDTO);
        assertNotNull(savedProduct);
    }

    @Test
    void testFindProduct() {
        ProductDTO productDTO = productService.findById(5L);
        System.out.println(productDTO);
    }

    @Test
    void testUpdateProduct() {
        ProductDTO productDTO = productService.findById(5L);
        productDTO.setName("Realme");
        productDTO.setDescription("from Realme Inc..");
        productDTO.setPrice(500.0);
        ProductDTO updatedProduct = productService.updateProduct(productDTO);
        assertNotNull(updatedProduct);
    }

    @Test
    void testDeleteProduct() {
        String s = productService.DeleteById(5L);
        System.out.println(s);
    }
}
