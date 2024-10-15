package creationalpatterns.training.geeksforgeeks.absrfactory;

import creationalpatterns.training.geeksforgeeks.absrfactory.factory.EuropeCarFactory;
import creationalpatterns.training.geeksforgeeks.absrfactory.factory.NorthAmericaCarFactory;
import creationalpatterns.training.geeksforgeeks.absrfactory.interfaces.Car;
import creationalpatterns.training.geeksforgeeks.absrfactory.interfaces.CarFactory;
import creationalpatterns.training.geeksforgeeks.absrfactory.interfaces.CarSpecification;

public class CarFactoryClient {
    public static void main(String[] args) {
        CarFactory northAmericanFactory = new NorthAmericaCarFactory();
        Car northAmericanCar = northAmericanFactory.createCar();
        CarSpecification northAmericanSpec = northAmericanFactory.createCarSpecification();
        northAmericanCar.assemble();
        northAmericanSpec.display();

        CarFactory eu = new EuropeCarFactory();
        Car euCar = eu.createCar();
        CarSpecification euSpec = eu.createCarSpecification();
        euCar.assemble();
        euSpec.display();
    }
}