package javarevisited.strategypattern;

public interface ShippingCostStrategy {
    double calculate(double weight);
}