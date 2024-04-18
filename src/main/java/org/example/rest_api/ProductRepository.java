package org.example.rest_api;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("productRepository")
public class ProductRepository {

    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }


    public void addProduct(Product product) {
        products.add(product);
    }

    public ProductRepository() {
        products.add(new Product("Iceberg", 2.17));
    }
}
