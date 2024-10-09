package creationalpatterns.builder.a2;

public class Client {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new LaptopComputerBuilder();
        MyLaptopComputer myLaptopComputer = new MyLaptopComputer(computerBuilder);
        Computer computer = myLaptopComputer
                .constructComputer();
        System.out.println(computer);
    }
}
