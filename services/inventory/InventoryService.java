package com.fixbot;

public class InventoryService {
    private InventoryRepo repo = new InventoryRepo();

    public void addItem(String sku, String name) {
        repo.saveItem(sku, name);
    }
}
