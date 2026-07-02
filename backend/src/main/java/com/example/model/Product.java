package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Product {

    private Long id;
    private String name;
    private BigDecimal price;
    private boolean enabled;

    public void disable() {
        this.enabled = false;
    }
}