package creationalpatterns.training.javaedupl.icecreamfactorypattern;

public class MainIceCream {
    public static void main(String[] args) {

        IceCream iceCream1 = new IceCreamFactory().getIceCream(IceCreamType.STRAWBERRY_ICE_CREAM);
        IceCream iceCream2 = new IceCreamFactory().getIceCream(IceCreamType.CHOCOLATE_ICE_CREAM);

        System.out.println(iceCream1);
        System.out.println(iceCream2);
    }
}