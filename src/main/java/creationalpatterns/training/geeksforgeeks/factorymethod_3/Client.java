package creationalpatterns.training.geeksforgeeks.factorymethod_3;

public class Client {
    private Vehicle vehicle;

    public Client(VehicleFactory vehicleFactory) {
        vehicle = vehicleFactory.createVehicle();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}