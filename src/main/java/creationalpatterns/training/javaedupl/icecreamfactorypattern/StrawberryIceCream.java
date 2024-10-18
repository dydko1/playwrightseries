package creationalpatterns.training.javaedupl.icecreamfactorypattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static creationalpatterns.training.javaedupl.icecreamfactorypattern.IceCreamDescription.STRAWBERRY_ICE_CREAM;

@Getter
@Setter
@ToString
public class StrawberryIceCream implements IceCream {

    private String name;
    private String price;
    private String calorie;

    StrawberryIceCream(String price, String calorie) {
        this.name = STRAWBERRY_ICE_CREAM;
        this.price=price;
        this.calorie=calorie;
    }


}