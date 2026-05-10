package com.fixbot;

public class PaymentService {
    public void processPayment(String invoiceId) {
        Invoice invoice = findById(invoiceId);
        // FIX: Add null check to prevent NullPointerException
        if (invoice == null) {
            throw new RuntimeException("Invoice not found: " + invoiceId);
        }
        double amount = invoice.getAmount(); 
        System.out.println("Processing payment for amount: " + amount);
    }
    
    private Invoice findById(String id) { return null; } // Mocks DB returning null
}
class Invoice { public double getAmount() { return 100.0; } }
