package javarevisited.factorypattern;

public class StandardShipping implements ShippingCostStrategy {
    @Override
    public double calculate(double weight) {
        System.out.println("To klasa: " + getClass().getSimpleName());
        return weight * 5.0;
    }
}