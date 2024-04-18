package org.example.rest_api;

import lombok.Getter;

@Getter
public class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {

        this.name = name;
        this.price = price;
    }
}
