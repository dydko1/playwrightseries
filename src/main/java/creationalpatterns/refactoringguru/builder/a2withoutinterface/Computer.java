package creationalpatterns.refactoringguru.builder.a2withoutinterface;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Computer {

    private String processor;
    private int memory;
    private int storage;
    private String graphicsCard;
}