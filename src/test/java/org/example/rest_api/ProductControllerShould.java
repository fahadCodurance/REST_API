package org.example.rest_api;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductControllerShould {
    @Test
    void get_list_of_products() {
        ProductRepository productRepository = mock(ProductRepository.class);
        ProductController productController = new ProductController(productRepository);
        Product expectedProduct  = new Product("Iceberg", 2.17);

        List<Product> expectedProductList = List.of(expectedProduct);
        when(productRepository.getProducts()).thenReturn(expectedProductList);
        List<Product> actualProductList = productController.getProducts();

        verify(productRepository).getProducts();
        assertEquals(expectedProductList, actualProductList);
    }
}