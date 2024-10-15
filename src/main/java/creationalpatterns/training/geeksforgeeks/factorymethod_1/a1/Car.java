package creationalpatterns.training.geeksforgeeks.factorymethod_1.a1;

public class Car implements MotorVehicle{

    @Override
    public void build() {
        System.out.println("Build Car");
    }
}