package org.example.rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @GetMapping
    @ResponseBody
    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productRepository.addProduct(product);
    }
}
