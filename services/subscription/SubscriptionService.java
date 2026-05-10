package com.fixbot;

public class SubscriptionService {
    public void renew(String planSlug) {
        Plan plan = findPlan(planSlug);
        String id = plan.getId(); // NPE here if plan is null
    }

    private Plan findPlan(String slug) {
        return null; // Mocks plan not found
    }
}

class Plan {
    public String getId() { return "plan_123"; }
}
