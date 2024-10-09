package creationalpatterns.builder.a2;

public class MyLaptopComputer {

    private ComputerBuilder computerBuilder;

    public MyLaptopComputer(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer constructComputer() {
        return computerBuilder
                .buildProcessor("Intel i7")
                .buildMemory(16)
                .buildStorage(512)
                .buildGraphicsCard("NVIDIA GTX 1660")
                .build();
    }
}
