package javarevisited.strategypattern;

public class ShippingCostContext {
    private ShippingCostStrategy strategy;

    public void setStrategy(ShippingCostStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateShippingCost(double weight) {
        return strategy.calculate(weight);
    }
}