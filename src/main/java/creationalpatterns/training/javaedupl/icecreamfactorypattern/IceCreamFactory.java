package creationalpatterns.training.javaedupl.icecreamfactorypattern;

public class IceCreamFactory {

    public IceCreamFactory() {
    }

    public IceCream getIceCream(IceCreamType iceCreamType) {
        return switch (iceCreamType) {
            case STRAWBERRY_ICE_CREAM -> new StrawberryIceCream("15", "600");
            case CHOCOLATE_ICE_CREAM -> new ChocolateIceCream("10", "300");
            default ->throw new IllegalStateException("Out of scope");
        };
    }
}