package creationalpatterns.training.geeksforgeeks.absrfactory.concreateproducts;

import creationalpatterns.training.geeksforgeeks.absrfactory.interfaces.CarSpecification;

public class NorthAmericaSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local regulations.");
    }
}