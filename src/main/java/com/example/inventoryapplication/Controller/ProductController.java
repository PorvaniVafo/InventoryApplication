package com.example.inventoryapplication.Controller;

import com.example.inventoryapplication.DTO.ProductRequest;
import com.example.inventoryapplication.Entity.Product;
import com.example.inventoryapplication.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody ProductRequest productRequest) {
        return productService.createProduct(productRequest);  // Pass the ProductRequest to the service
    }
}
