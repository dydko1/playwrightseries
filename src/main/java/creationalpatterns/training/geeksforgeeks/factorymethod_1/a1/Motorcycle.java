package creationalpatterns.training.geeksforgeeks.factorymethod_1.a1;

public class Motorcycle implements MotorVehicle {

    @Override
    public void build() {
        System.out.println("Build Motorcycle");
    }
}