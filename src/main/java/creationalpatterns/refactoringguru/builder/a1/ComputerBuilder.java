package creationalpatterns.refactoringguru.builder.a1;

public interface ComputerBuilder {
    ComputerBuilder buildProcessor(String processor);
    ComputerBuilder buildMemory(int memory);
    ComputerBuilder buildStorage(int storage);
    ComputerBuilder buildGraphicsCard(String graphicsCard);
    Computer build();
}