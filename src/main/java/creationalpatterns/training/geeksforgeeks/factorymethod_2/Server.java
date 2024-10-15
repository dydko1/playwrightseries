package creationalpatterns.training.geeksforgeeks.factorymethod_2;

public class Server extends Computer {

    private String cpu;
    private String ram;
    private String hdd;

    public Server(String cpu, String Ram, String hdd) {
        this.cpu = cpu;
        this.ram = Ram;
        this.hdd = hdd;
    }

    @Override
    String getCpu() {
        return cpu;
    }

    @Override
    String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    @Override
    public String toString(){
        return String.format("Computer has CPU: %s, Ram: %s, Hdd %s", getCpu(), getRam(),getHdd());
    }
}