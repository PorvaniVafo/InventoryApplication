package com.example.inventoryapplication.Job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class InventoryJob {

    @Scheduled(fixedRate = 60000)  // Runs every minute
    public void checkInventory() {
        System.out.println("Checking inventory...");
    }
}