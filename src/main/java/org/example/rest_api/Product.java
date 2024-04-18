package org.example.rest_api;

import lombok.Data;
import lombok.Getter;

@Data
public class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {

        this.name = name;
        this.price = price;
    }
}
