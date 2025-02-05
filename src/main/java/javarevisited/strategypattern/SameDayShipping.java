package javarevisited.strategypattern;

public class SameDayShipping implements ShippingCostStrategy {
    @Override
    public double calculate(double weight) {
        return weight * 20.0;
    }
}