package javarevisited.factorypattern;

public class Main123 {
    public static void main(String[] args) {

        ShippingCostCalculator shippingCostCalculator = new ShippingCostCalculator();
        System.out.println(shippingCostCalculator.calculateShippingCost("STANDARD", 5.0));
        System.out.println(shippingCostCalculator.calculateShippingCost("SAME_DAY", 5.0));
//        System.out.println(shippingCostCalculator.calculateShippingCost("overnight", 5.0));
//        System.out.println(shippingCostCalculator.calculateShippingCost("express", 5.0));

    }
}