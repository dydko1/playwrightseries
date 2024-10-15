package creationalpatterns.training.medium.factory;

public class MainDish {
    public static void main(String[] args) {
        DishFactory pizzaFac = new PizzaFactory();
        Dish pizza = pizzaFac.produceDish();
        System.out.println(pizza);

        DishFactory sushiFac = new SushiFactory();
        Dish sushi= sushiFac.produceDish();
        System.out.println(sushi);
    }
}