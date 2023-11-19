package refactor.factory;

import refactor.service.BillingCycle;
import refactor.service.Subscription;
import refactor.service.impl.MusicSubscription;
import refactor.service.impl.PodcastSubscription;
import refactor.service.impl.VideoSubscription;

public class SubscriptionFactory {
    public static Subscription getSubscription(String type, BillingCycle billingCycle) {
        switch (type) {
            case "Video":
                return new VideoSubscription(billingCycle);
            case "Music":
                return new MusicSubscription(billingCycle);
            case "Podcast":
                return new PodcastSubscription(billingCycle);
            default:
                throw new IllegalArgumentException("Invalid subscription type");
        }
    }
}
