package creationalpatterns.training.geeksforgeeks.factorymethod_3;

public class FourWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new FourVehicle();
    }
}