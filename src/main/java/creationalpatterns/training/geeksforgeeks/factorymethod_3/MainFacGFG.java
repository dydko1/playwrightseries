package creationalpatterns.training.geeksforgeeks.factorymethod_3;

public class MainFacGFG {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory2 = new TwoWheelerFactory();
        Client client2 = new Client(vehicleFactory2);
        Vehicle vehicle2 = client2.getVehicle();
        vehicle2.printVehicle();

        VehicleFactory vehicleFactory4 = new FourWheelerFactory();
        Client client4 = new Client(vehicleFactory4);
        Vehicle vehicle4 = client4.getVehicle();
        vehicle4.printVehicle();
    }
}