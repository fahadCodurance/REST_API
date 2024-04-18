package org.example.rest_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shopping-cart")
public class ShoppingCartController {

    @GetMapping
    public String getShoppingCart() {

    }
}
