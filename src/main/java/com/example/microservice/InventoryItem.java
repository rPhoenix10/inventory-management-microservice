package com.example.microservice;

public record InventoryItem(
    String id,
    String sku,
    String productName,
    int quantityInStock
) {}