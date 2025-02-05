package javarevisited.factorypattern;

public class ExpressShipping implements ShippingCostStrategy {
    @Override
    public double calculate(double weight) {
        System.out.println("To klasa: " + getClass().getSimpleName());
        return weight * 10.0;
    }
}