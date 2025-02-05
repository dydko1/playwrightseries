package javarevisited.factorypattern;

public class InternationalShipping implements ShippingCostStrategy {
    @Override
    public double calculate(double weight) {
        System.out.println("To klasa: " + getClass().getSimpleName());
        return weight * 50.0;
    }
}