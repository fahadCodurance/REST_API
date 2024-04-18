package org.example.rest_api;

import org.example.rest_api.controllers.ShoppingCartController;
import org.example.rest_api.models.shoppingcart.ShoppingCartService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ShoppingCartControllerShould {
    @Test
    public void ask_for_shopping_cart() {
        ShoppingCartService shoppingCartService = mock(ShoppingCartService.class);

        ShoppingCartController shoppingCartController = new ShoppingCartController(shoppingCartService);
        shoppingCartController.getShoppingCart();

        verify(shoppingCartService).getShoppingCart();
    }
}