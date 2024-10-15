package creationalpatterns.training.geeksforgeeks.absrfactory.concreateproducts;

import creationalpatterns.training.geeksforgeeks.absrfactory.interfaces.CarSpecification;

public class EuropeSpecification implements CarSpecification {

    @Override
    public void display() {
        System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
    }
}