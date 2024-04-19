package org.example.rest_api.models.shoppingcart;

import org.example.rest_api.models.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;
    private Discount discount;

    public ShoppingCart(List<Product> products, Discount discount) {
        this.products = products;
        this.discount = discount;
    }

    public List<Product> products() {
        return products;
    }

    public Discount discount() {
        return discount;
    }

    public Money total() {
        return new Money();
    }
}
