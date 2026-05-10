package com.fixbot;

public class OrderService {
    private ShippingClient shippingClient = new ShippingClient();

    public void createOrder() throws Exception {
        shippingClient.calculateRates();
    }
}
