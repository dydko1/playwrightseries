package creationalpatterns.builder.a2withoutinterface;

public class ComputerBuilder {

    private Computer computer;

    public ComputerBuilder() {
        this.computer = new Computer();
    }

    public ComputerBuilder buildProcessor(String processor) {
        computer.setProcessor(processor);
        return this;
    }

    public ComputerBuilder buildMemory(int memory) {
        computer.setMemory(memory);
        return this;
    }

    public ComputerBuilder buildStorage(int storage) {
        computer.setStorage(storage);
        return this;
    }

    public ComputerBuilder buildGraphicsCard(String graphicsCard) {
        computer.setGraphicsCard(graphicsCard);
        return this;
    }

    public Computer build() {
        return computer;
    }
}
