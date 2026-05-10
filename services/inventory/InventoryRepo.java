package com.fixbot;

public class InventoryRepo {
    public void saveItem(String sku, String name) {
        // FIX: Check if SKU exists before inserting to avoid IntegrityError (Duplicate Key)
        if (checkIfSkuExists(sku)) {
            System.out.println("SKU already exists, skipping insert: " + sku);
            return;
        }
        System.out.println("Executing INSERT INTO items (sku, name) VALUES (" + sku + ", " + name + ")");
    }
    
    private boolean checkIfSkuExists(String sku) { return true; } // Mocking existing SKU
}
