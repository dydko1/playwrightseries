package creationalpatterns.training.geeksforgeeks.absrfactory.concreateproducts;

import creationalpatterns.training.geeksforgeeks.absrfactory.interfaces.Car;

public class Hatchback implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Hatchback car.");
    }
}