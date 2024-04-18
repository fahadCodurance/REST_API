package org.example.rest_api;

import org.example.rest_api.controllers.ShoppingCartController;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ShoppingCartController.class)
public class ShoppingCartEndToEnd {

    @Autowired
    MockMvc mockMvc;
    @Test
    public void end_to_end_test() throws Exception {

        JSONObject expectedShoppingCart = new JSONObject();
        expectedShoppingCart.put("products", List.of());
        expectedShoppingCart.put("discount", null);
        expectedShoppingCart.put("total", "0 €");


        mockMvc.perform(get("/shopping-cart"))
            .andExpect(status().isOk())
            .andExpect(content().json(expectedShoppingCart.toString()));
    }
}
