package com.example.demo;

public record InventoryItem(
    String id,
    String sku,
    String productName,
    int quantityInStock
) {}