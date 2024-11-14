package com.example.inventoryapplication.Mapper;

import com.example.inventoryapplication.Entity.Product;
import com.example.inventoryapplication.DTO.ProductResponse;

public class ProductMapper {

    public static ProductResponse toProductResponse(Product product) {
        ProductResponse response = new ProductResponse();
        response.setId(product.getId());
        response.setName(product.getName());
        response.setDescription(product.getDescription());
        response.setQuantity(product.getQuantity());
        response.setPrice(product.getPrice());
        response.setStatus(product.getStatus().toString());  // Now it will resolve correctly
        response.setCategoryName(product.getCategory().getName());
        return response;
    }
}
