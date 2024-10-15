package creationalpatterns.training.geeksforgeeks.factorymethod_1.a1;

public class CarFactory extends MotorVehicleFactory {

    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Car();
    }
}