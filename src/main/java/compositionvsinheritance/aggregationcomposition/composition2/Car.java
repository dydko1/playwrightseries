package compositionvsinheritance.aggregationcomposition.composition2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
public class Car {

    private String name;
    public Engine engine;
}