package refactor;


import refactor.factory.SubscriptionFactory;
import refactor.service.*;

public class SubscriptionProcessor {
	public static void main(String[] args) {
		String subscriptionType = args[0];
		BillingCycle billingCycle = getBillingCycle(args[1]);
		SubscriptionProcessor process = new SubscriptionProcessor();
        int total = process.createSubscriptionAndCalculateCost(subscriptionType, billingCycle);
        System.out.println("Total cost for next 12 months will be " + total);
    }
	private static BillingCycle getBillingCycle(String billingCycle) {
		switch (billingCycle) {
			case "Monthly":
				return new MonthlyStrategy();
			case "Quarterly":
				return new QuarterlyStrategy();
			case "Annual":
				return new AnnualStrategy();
			default:
				throw new IllegalArgumentException("Invalid billing cycle");
		}
	}

    public int createSubscriptionAndCalculateCost(String subscriptionType, BillingCycle billingCycle) {
        Subscription subscription = SubscriptionFactory.getSubscription(subscriptionType, billingCycle);
        subscription.initiateSubscription();
        return subscription.calculateAnnualCost();
    }
}
