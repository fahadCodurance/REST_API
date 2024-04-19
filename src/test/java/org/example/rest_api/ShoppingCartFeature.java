package org.example.rest_api;

import org.example.rest_api.controllers.ShoppingCartController;
import org.example.rest_api.models.shoppingcart.NoDiscount;
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

    private final List<Object> NO_PRODUCTS = List.of();
    private final NoDiscount NO_DISCOUNT = new NoDiscount();
    private final String ZERO_EUROS = "0 €";
    @Test
    public void foo() throws JSONException {
        JSONObject expectedShoppingCart = new JSONObject();
        expectedShoppingCart.put("products", NO_PRODUCTS);
        expectedShoppingCart.put("discount", NO_DISCOUNT);
        expectedShoppingCart.put("total", ZERO_EUROS);
        ShoppingCartRepository shoppingCartRepository = mock(ShoppingCartRepository.class);
        ShoppingCartService shoppingCartService = new ShoppingCartService(shoppingCartRepository);
        ShoppingCartController shoppingCartController = new ShoppingCartController(shoppingCartService);

        shoppingCartController.getShoppingCart();

        verify(shoppingCartRepository).getShoppingCart();
    }
}
