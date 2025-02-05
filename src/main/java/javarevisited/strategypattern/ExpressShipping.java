package javarevisited.strategypattern;

public class ExpressShipping implements ShippingCostStrategy {
    @Override
    public double calculate(double weight) {
        return weight * 10.0;
    }
}