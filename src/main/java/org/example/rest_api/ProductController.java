package org.example.rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> addProduct(@RequestBody Product product) {
        if(productRepository.exists(product.getName())) {
            throw new ProductAlreadyExistsException();
        }
        productRepository.addProduct(product);
        return new ResponseEntity<>("Product added", new HttpHeaders(), HttpStatus.CREATED);
    }
}
