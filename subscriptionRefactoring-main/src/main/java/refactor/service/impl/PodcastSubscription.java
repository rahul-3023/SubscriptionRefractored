package refactor.service.impl;

import refactor.service.BillingCycle;
import refactor.service.Subscription;

public class PodcastSubscription implements Subscription {
        private final BillingCycle billingCycle;

        public PodcastSubscription(BillingCycle billingCycle) {
            this.billingCycle = billingCycle;
        }
        @Override
        public void initiateSubscription() {
            System.out.println("Podcast subscription created with " + billingCycle.getDescription() + " billing.");
        }

        @Override
        public int calculateAnnualCost() {
            return billingCycle.calculateCost(50, 100, 300);
        }
}
