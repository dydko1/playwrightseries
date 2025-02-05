package javarevisited.strategypattern1;

public class MainCost {

    public static void main(String[] args) {

        ShippingCostCalculator2 calculator = new ShippingCostCalculator2();

        Double cost=calculator.calculateShippingCost("STANDARD", 10.0);
        System.out.println(cost);
        cost=calculator.calculateShippingCost("EXPRESS",10);
        System.out.println(cost);
    }
}