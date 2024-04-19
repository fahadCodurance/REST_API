package org.example.rest_api.models.shoppingcart;

import org.springframework.stereotype.Component;

@Component("shoppingCartService")
public class ShoppingCartService {
    private  ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartService(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCartRepository.getShoppingCart();
    }
}
