package creationalpatterns.training.geeksforgeeks.absrfactory.concreateproducts;

import creationalpatterns.training.geeksforgeeks.absrfactory.interfaces.Car;

public class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan car.");
    }
}