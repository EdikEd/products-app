package com.example.model;

import com.example.enums.ProductStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Product {

    private Long id;
    private String name;
    private BigDecimal price;
    private ProductStatus status;

    public void disable() {
        this.status = ProductStatus.OFF;
    }
}