package refactor.service.impl;

import refactor.service.BillingCycle;
import refactor.service.Subscription;

public class VideoSubscription implements Subscription {

    private final BillingCycle billingCycle;

    public VideoSubscription(BillingCycle billingCycle) {
        this.billingCycle = billingCycle;
    }
    @Override
    public void initiateSubscription() {
        System.out.println("Video subscription created with " + billingCycle.getDescription() + " billing.");
    }

    @Override
    public int calculateAnnualCost() {
        return billingCycle.calculateCost(10, 20, 60);
    }
}
