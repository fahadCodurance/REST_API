package org.example.rest_api;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("productRepository")
public class ProductRepository {
    public List<Product> getProducts() {
        Product product = new Product("Iceberg", 2.17);
        return List.of(product);
    }
}
