package javarevisited.strategypattern;

public class OvernightShipping implements ShippingCostStrategy {
    @Override
    public double calculate(double weight) {
        return weight * 30.0;
    }
}