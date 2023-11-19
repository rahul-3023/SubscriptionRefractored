package refactor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import refactor.service.AnnualStrategy;
import refactor.service.BillingCycle;
import refactor.service.MonthlyStrategy;
import refactor.service.QuarterlyStrategy;

class TestSubscrptionProcessor {
	
	private SubscriptionProcessor check;
	
	@BeforeEach
	void setUp() {
		check = new SubscriptionProcessor();
	}
	
	@Test
	void getTwelveMonthCostForVideoMonthlySubscription() {
        BillingCycle billingCycle = new MonthlyStrategy();
		int result = check.createSubscriptionAndCalculateCost("Video", billingCycle);
		assertEquals(120, result);
	}

	@Test
	void getTwelveMonthCostForVideoQuarterlySubscription() {
        BillingCycle billingCycle = new QuarterlyStrategy();
		int result = check.createSubscriptionAndCalculateCost("Video", billingCycle);
		assertEquals(80, result);
	}
	
	@Test
	void getTwelveMonthCostForVideoAnnualSubscription() {
        BillingCycle billingCycle = new AnnualStrategy();
		int result = check.createSubscriptionAndCalculateCost("Video", billingCycle);
		assertEquals(60, result);
	}
	
	@Test
	void getTwelveMonthCostForMusicMonthlySubscription() {
        BillingCycle billingCycle = new MonthlyStrategy();
		int result = check.createSubscriptionAndCalculateCost("Music", billingCycle);
		assertEquals(240, result);
	}

	@Test
	void getTwelveMonthCostForMusicQuarterlySubscription() {
        BillingCycle billingCycle = new QuarterlyStrategy();
		int result = check.createSubscriptionAndCalculateCost("Music", billingCycle);
		assertEquals(200, result);
	}
	
	@Test
	void getTwelveMonthCostForMusicAnnualSubscription() {
        BillingCycle billingCycle = new AnnualStrategy();
		int result = check.createSubscriptionAndCalculateCost("Music", billingCycle);
		assertEquals(150, result);
	}
	
	@Test
	void getTwelveMonthCostForPodcastMonthlySubscription() {
        BillingCycle billingCycle = new MonthlyStrategy();
		int result = check.createSubscriptionAndCalculateCost("Podcast", billingCycle);
		assertEquals(600, result);
	}

	@Test
	void getTwelveMonthCostForPodcastQuarterlySubscription() {
        BillingCycle billingCycle = new QuarterlyStrategy();
		int result = check.createSubscriptionAndCalculateCost("Podcast", billingCycle);
		assertEquals(400, result);
	}
	
	@Test
	void getTwelveMonthCostForPodcastAnnualSubscription() {
        BillingCycle billingCycle = new AnnualStrategy();
		int result = check.createSubscriptionAndCalculateCost("Podcast", billingCycle);
		assertEquals(300, result);
	}
}
