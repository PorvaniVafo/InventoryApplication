package com.example.inventoryapplication.Service;

import com.example.inventoryapplication.DTO.ProductRequest;
import com.example.inventoryapplication.Entity.Product;
import com.example.inventoryapplication.Repository.ProductRepository;
import com.example.inventoryapplication.Repository.CategoryRepository;
import com.example.inventoryapplication.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UserRepository userRepository;

    public Product createProduct(ProductRequest productRequest) {
        // Convert ProductRequest to Product entity
        Product product = new Product();
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setQuantity(productRequest.getQuantity());
        product.setPrice(productRequest.getPrice());

        // You may need to set category and user if the product is associated with them
        product.setCategory(categoryRepository.findById(productRequest.getCategoryId()).orElse(null));
        product.setCreatedBy(userRepository.findById(productRequest.getUserId()).orElse(null));

        // Save the product
        return productRepository.save(product);
    }
}
