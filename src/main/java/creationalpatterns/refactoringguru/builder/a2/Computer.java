package creationalpatterns.refactoringguru.builder.a2;

import lombok.Data;

@Data
public class Computer {
    private String processor;
    private int memory;
    private int storage;
    private String graphicsCard;
}