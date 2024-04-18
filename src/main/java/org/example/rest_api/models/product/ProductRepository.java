package org.example.rest_api.models.product;

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
    public boolean exists(String productName) {
        return products.stream().anyMatch(product -> product.getName().equals(productName));
    }
}
