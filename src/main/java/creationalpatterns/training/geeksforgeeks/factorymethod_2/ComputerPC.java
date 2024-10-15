package creationalpatterns.training.geeksforgeeks.factorymethod_2;

public class ComputerPC extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new PC("2GHz", "16GB");
    }
}