package com.example.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @GetMapping
    public List<InventoryItem> getAllInventory() {
        // Temporary hardcoded mock data
        // Will move this data into the Service layer later on
        return List.of(
            new InventoryItem("1", "SKU-100", "Motherboard", 15),
            new InventoryItem("2", "SKU-200", "Graphics Card", 5)
        );
    }
}