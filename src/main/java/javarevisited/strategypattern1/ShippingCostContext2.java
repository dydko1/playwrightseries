package javarevisited.strategypattern1;

public class ShippingCostContext2 {

    private ShippingCostStrategy2 strategy;

    public void setStrategy(ShippingCostStrategy2 strategy) {
        this.strategy = strategy;
    }

    public double calculateShippingCost1(double weight) {
        return strategy.calculate(weight);
    }
}