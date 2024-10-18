package creationalpatterns.training.javaedupl.icecreamfactorypattern;

public class IceCreamDescription {

    private IceCreamDescription() {
        throw new IllegalStateException("'IceCreamDescription' is a utility class!");
    }

    public static final String STRAWBERRY_ICE_CREAM = "Lody truskawkowe";
    public static final String CHOCOLATE_ICE_CREAM = "Lody czekoladowe";
}