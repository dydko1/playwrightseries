package creationalpatterns.training.geeksforgeeks.factorymethod_2;

public abstract class Computer {

    abstract String getCpu();
    abstract String getRam();

    @Override
    public String toString(){
        return String.format("Computer has CPU: %s, Ram: %s", getCpu(), getRam());
    }
}