package org.example.rest_api;

import org.example.rest_api.models.product.Product;
import org.example.rest_api.models.shoppingcart.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ShoppingCartServiceShould {
    @Test
    void ask_for_shopping_cart() {
        ShoppingCartRepository shoppingCartRepository = mock(ShoppingCartRepository.class);
        ShoppingCartService shoppingCartService = new ShoppingCartService(shoppingCartRepository);

        shoppingCartService.getShoppingCart();

        verify(shoppingCartRepository).getShoppingCart();
    }
}