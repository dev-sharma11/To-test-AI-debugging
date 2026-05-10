package com.fixbot;

public class PaymentController {
    private PaymentService paymentService = new PaymentService();

    public void checkout(String invoiceId) {
        paymentService.processPayment(invoiceId);
    }
}
