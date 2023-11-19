package refactor.service;

public class AnnualStrategy implements BillingCycle {
    @Override
    public int calculateCost(int monthlyCost, int quarterlyCost, int annualCost) {
        return annualCost;
    }
    @Override
    public String getDescription() {
        return "Annual";
    }
}
