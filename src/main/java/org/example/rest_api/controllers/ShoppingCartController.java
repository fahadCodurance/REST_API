package org.example.rest_api.controllers;

import org.example.rest_api.models.shoppingcart.ShoppingCart;
import org.json.JSONObject;
import org.example.rest_api.models.shoppingcart.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shopping-cart")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    @Autowired
    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping
    public String getShoppingCart() {
        ShoppingCart shoppingCart = shoppingCartService.getShoppingCart();
        return jsonStringFrom(shoppingCart);
    }

    private String jsonStringFrom(ShoppingCart shoppingCart) {
        return new JSONObject()
            .put("products", shoppingCart.products())
            .put("discount", shoppingCart.discount())
            .put("total", shoppingCart.total())
            .toString();
    }
}
