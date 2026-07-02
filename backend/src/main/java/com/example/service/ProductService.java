package com.example.service;

import com.example.model.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>(List.of(
            new Product(1L, "Mobilný internet", BigDecimal.valueOf(15.99), true),
            new Product(2L, "Televízia", BigDecimal.valueOf(9.99), false),
            new Product(3L, "Volania do zahraničia", BigDecimal.valueOf(4.99), true),
            new Product(4L, "Extra dáta", BigDecimal.valueOf(6.99), true)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public void disableProduct(Long id) {
        products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .ifPresent(Product::disable);
    }
}