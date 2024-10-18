package creationalpatterns.training.javaedupl.icecreamfactorypattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static creationalpatterns.training.javaedupl.icecreamfactorypattern.IceCreamDescription.CHOCOLATE_ICE_CREAM;

@Getter
@Setter
@ToString
public class ChocolateIceCream implements IceCream {

    private String name;
    private String price;
    private String calorie;

    ChocolateIceCream(String price, String calorie) {
        this.name = CHOCOLATE_ICE_CREAM;
        this.price = price;
        this.calorie = calorie;
    }
}