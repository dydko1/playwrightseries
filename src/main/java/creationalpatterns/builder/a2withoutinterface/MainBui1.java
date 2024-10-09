package creationalpatterns.builder.a2withoutinterface;

public class MainBui1 {
    public static void main(String[] args) {

        Computer computer = new ComputerBuilder()
                .buildProcessor("AMD 123")
                .buildMemory(123)
                .buildStorage(123333)
                .buildGraphicsCard("GeForce 4555")
                .build();

        System.out.println(computer);
    }
}
