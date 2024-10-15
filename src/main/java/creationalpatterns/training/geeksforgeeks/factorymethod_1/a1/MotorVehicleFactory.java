package creationalpatterns.training.geeksforgeeks.factorymethod_1.a1;

public abstract class MotorVehicleFactory {

    public MotorVehicle create() {
        MotorVehicle vehicle = createMotorVehicle();
        vehicle.build();
        return vehicle;
    }

    protected abstract MotorVehicle createMotorVehicle();
}