package com.example.service;

import com.example.enums.ProductStatus;
import com.example.model.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>(List.of(
            new Product(1L, "Mobilný internet", BigDecimal.valueOf(15.99), ProductStatus.ON),
            new Product(2L, "Televízia", BigDecimal.valueOf(9.99), ProductStatus.OFF),
            new Product(3L, "Volania do zahraničia", BigDecimal.valueOf(4.99), ProductStatus.ON),
            new Product(4L, "Extra dáta", BigDecimal.valueOf(6.99), ProductStatus.ON)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public void disableProduct(Long id) {
        Product product = products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Product not found"));

        product.disable();
    }
}