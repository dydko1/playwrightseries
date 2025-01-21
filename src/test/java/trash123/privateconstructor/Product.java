package trash123.privateconstructor;

import lombok.Getter;

@Getter
public class Product {
    private String name;

    private Product(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public static Product getLaptop(){
        return new Product("laptop");
    }


    public static Product getMobile(){
        return new Product("mobile");
    }

    public String getName() {
        return name;
    }
}