package javarevisited.strategypattern1;

import java.util.HashMap;
import java.util.Map;

public class ShippingCostCalculator2 {

    private static final Map<String, ShippingCostStrategy2> strategies = new HashMap<>();
    private final ShippingCostContext2 context = new ShippingCostContext2();

    static {
        strategies.put("STANDARD", new StandardShipping2());
        strategies.put("EXPRESS", new ExpressShipping2());
    }

    public double calculateShippingCost(String shippingType, double weight) {
        ShippingCostStrategy2 strategy = strategies.get(shippingType);
        if (strategy == null) {
            throw new IllegalArgumentException("Invalid shipping type: " + shippingType);
        }
        context.setStrategy(strategy);
        return context.calculateShippingCost1(weight);
    }
}