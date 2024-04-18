package org.example.rest_api;

import org.example.rest_api.controllers.ShoppingCartController;
import org.example.rest_api.models.shoppingcart.ShoppingCartRepository;
import org.example.rest_api.models.shoppingcart.ShoppingCartService;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ShoppingCartFeature {

    @Test
    public void foo() throws JSONException {
        JSONObject expectedShoppingCart = new JSONObject();
        expectedShoppingCart.put("products", List.of());
        expectedShoppingCart.put("discount", null);
        expectedShoppingCart.put("total", "0 €");
        ShoppingCartRepository shoppingCartRepository = mock(ShoppingCartRepository.class);
        ShoppingCartService shoppingCartService = new ShoppingCartService();
        ShoppingCartController shoppingCartController = new ShoppingCartController(shoppingCartService);

        shoppingCartController.getShoppingCart();

        verify(shoppingCartRepository).getShoppingCart();
    }
}
