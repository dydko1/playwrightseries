package javarevisited.factorypattern;

public class ShippingCostCalculator {
    public double calculateShippingCost(String shippingType, double weight) {
        ShippingCostStrategy strategy = ShippingCostFactory.getStrategy(shippingType);
        return strategy.calculate(weight);
    }
}