package refactor.service;

public interface BillingCycle {
    int calculateCost(int monthlyCost, int quarterlyCost, int annualCost);
    String getDescription();
}
