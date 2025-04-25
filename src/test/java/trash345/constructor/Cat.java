package trash345.constructor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat {

    private String name;
    private Integer age;

    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }
}
