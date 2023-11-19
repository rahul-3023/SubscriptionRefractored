package refactor.service.impl;

import refactor.service.BillingCycle;
import refactor.service.Subscription;

public class MusicSubscription implements Subscription {

    private final BillingCycle billingCycle;

    public MusicSubscription(BillingCycle billingCycle) {
        this.billingCycle = billingCycle;
    }
    @Override
    public void initiateSubscription() {
        System.out.println("Music subscription created with " + billingCycle.getDescription() + " billing.");
    }

    @Override
    public int calculateAnnualCost() {
        return billingCycle.calculateCost(20, 50, 150);
    }
}
