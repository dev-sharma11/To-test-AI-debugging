package com.fixbot;

public class InventoryRepo {
    public void saveItem(String sku, String name) {
        // BUG: Directly executes insert, will throw IntegrityError on duplicate SKU
        System.out.println("Executing INSERT INTO items (sku, name) VALUES (" + sku + ", " + name + ")");
        throw new RuntimeException("IntegrityError: duplicate key value violates unique constraint");
    }
}
