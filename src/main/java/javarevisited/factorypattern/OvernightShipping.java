package javarevisited.factorypattern;

public class OvernightShipping implements ShippingCostStrategy {
    @Override
    public double calculate(double weight) {
        System.out.println("To klasa: "+getClass().getSimpleName());
        return weight * 30.0;
    }
}