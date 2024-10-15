package creationalpatterns.refactoringguru.builder.a2;

public class LaptopComputerBuilder implements ComputerBuilder {

    private Computer computer;

    LaptopComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public ComputerBuilder buildProcessor(String processor) {
        computer.setProcessor(processor);
        return this;
    }

    @Override
    public ComputerBuilder buildMemory(int memory) {
        computer.setMemory(memory);
        return this;
    }

    @Override
    public ComputerBuilder buildStorage(int storage) {
        computer.setStorage(storage);
        return this;
    }

    @Override
    public ComputerBuilder buildGraphicsCard(String graphicsCard) {
        computer.setGraphicsCard(graphicsCard);
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }
}
