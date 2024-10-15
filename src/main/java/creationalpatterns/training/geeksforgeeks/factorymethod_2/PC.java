package creationalpatterns.training.geeksforgeeks.factorymethod_2;

public class PC extends Computer {

    private String cpu;
    private String ram;

    public PC(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    @Override
    String getCpu() {
        return this.cpu;
    }

    @Override
    String getRam() {
        return this.ram;
    }
}