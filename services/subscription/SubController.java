package com.fixbot;

public class SubController {
    private SubscriptionService subService = new SubscriptionService();

    public void handleWebhook(String slug) {
        subService.renew(slug);
    }
}
