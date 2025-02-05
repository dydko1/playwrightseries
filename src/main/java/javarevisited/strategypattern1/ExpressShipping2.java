package javarevisited.strategypattern1;

public class ExpressShipping2 implements ShippingCostStrategy2 {
    @Override
    public double calculate(double weight) {
        return 20.0;
    }
}