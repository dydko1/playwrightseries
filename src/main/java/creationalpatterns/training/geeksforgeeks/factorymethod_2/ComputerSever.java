package creationalpatterns.training.geeksforgeeks.factorymethod_2;

public class ComputerSever extends ComputerFactory{
    @Override
    public Computer createComputer() {
        return new Server("5GHz", "32GB", "500 GB");
    }
}