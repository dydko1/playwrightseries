package creationalpatterns.training.geeksforgeeks.absrfactory.factory;

import creationalpatterns.training.geeksforgeeks.absrfactory.concreateproducts.EuropeSpecification;
import creationalpatterns.training.geeksforgeeks.absrfactory.concreateproducts.Hatchback;
import creationalpatterns.training.geeksforgeeks.absrfactory.interfaces.Car;
import creationalpatterns.training.geeksforgeeks.absrfactory.interfaces.CarFactory;
import creationalpatterns.training.geeksforgeeks.absrfactory.interfaces.CarSpecification;

public class EuropeCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecification createCarSpecification() {
        return new EuropeSpecification();
    }
}