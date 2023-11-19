package refactor.service;

public class MonthlyStrategy implements BillingCycle {
    @Override
    public int calculateCost(int monthlyCost, int quarterlyCost, int annualCost) {
        return monthlyCost * 12;
    }
    @Override
    public String getDescription() {
        return "Monthly";
    }
}
