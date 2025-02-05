package javarevisited.strategypattern1;

public class StandardShipping2 implements ShippingCostStrategy2 {
    @Override
    public double calculate(double weight) {
        return weight * 10.0;
    }
}