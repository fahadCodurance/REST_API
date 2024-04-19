package org.example.rest_api.controller;

import org.example.rest_api.controllers.ShoppingCartController;
import org.example.rest_api.models.product.Product;
import org.example.rest_api.models.shoppingcart.Discount;
import org.example.rest_api.models.shoppingcart.NoDiscount;
import org.example.rest_api.models.shoppingcart.ShoppingCart;
import org.example.rest_api.models.shoppingcart.ShoppingCartService;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ShoppingCartControllerShould {
    private static final Discount NO_DISCOUNT = new NoDiscount();

    @Test
    public void return_json_representing_shopping_cart() throws JSONException {
        ShoppingCartService shoppingCartService = mock(ShoppingCartService.class);
        ShoppingCartController shoppingCartController = new ShoppingCartController(shoppingCartService);
        List<Product> products = List.of();
        ShoppingCart shoppingCart = new ShoppingCart(products, NO_DISCOUNT);
        when(shoppingCartService.getShoppingCart()).thenReturn(shoppingCart);

        String result = shoppingCartController.getShoppingCart();

        verify(shoppingCartService).getShoppingCart();
        assertEquals(jsonStringRepresenting(shoppingCart), result);
    }

    private String jsonStringRepresenting(ShoppingCart shoppingCart) throws JSONException {
        return new JSONObject()
            .put("products", shoppingCart.products())
            .put("discount", shoppingCart.discount())
            .put("total", shoppingCart.total())
            .toString();
    }
}