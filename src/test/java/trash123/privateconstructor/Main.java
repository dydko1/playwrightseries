package trash123.privateconstructor;

public class Main {
    public static void main(String[] args) {
        Product laptop = Product.getLaptop();
        Product mobile = Product.getMobile();
        System.out.println(laptop.getName());
        System.out.println(mobile.getName());
    }
}