package refactor.service;

public class QuarterlyStrategy implements BillingCycle {
    @Override
    public int calculateCost(int monthlyCost, int quarterlyCost, int annualCost) {
        return quarterlyCost * 4;
    }
    @Override
    public String getDescription() {
        return "Quarterly";
    }
}
