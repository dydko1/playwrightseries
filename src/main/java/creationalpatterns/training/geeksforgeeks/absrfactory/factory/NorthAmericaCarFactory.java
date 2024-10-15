package creationalpatterns.training.geeksforgeeks.absrfactory.factory;

import creationalpatterns.training.geeksforgeeks.absrfactory.concreateproducts.NorthAmericaSpecification;
import creationalpatterns.training.geeksforgeeks.absrfactory.concreateproducts.Sedan;
import creationalpatterns.training.geeksforgeeks.absrfactory.interfaces.Car;
import creationalpatterns.training.geeksforgeeks.absrfactory.interfaces.CarFactory;
import creationalpatterns.training.geeksforgeeks.absrfactory.interfaces.CarSpecification;

public class NorthAmericaCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createCarSpecification() {
        return new NorthAmericaSpecification();
    }
}