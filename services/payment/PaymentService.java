package com.fixbot;

public class PaymentService {
    public void processPayment(String invoiceId) {
        // BUG: Potential NullPointerException if invoice is not found
        Invoice invoice = findById(invoiceId);
        double amount = invoice.getAmount(); 
        System.out.println("Processing payment for amount: " + amount);
    }
    
    private Invoice findById(String id) { return null; } // Mocks DB returning null
}
class Invoice { public double getAmount() { return 100.0; } }
