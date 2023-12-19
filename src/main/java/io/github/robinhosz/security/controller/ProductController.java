package io.github.robinhosz.security.controller;

import io.github.robinhosz.security.dto.ProductDTO;
import io.github.robinhosz.security.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody ProductDTO productDTO) {

        productService.save(productDTO);

        return ResponseEntity.ok("Product created successfully");
    }
}