package compositionvsinheritance.a1.mediumcomposition;

import compositionvsinheritance.a1.mediumcomposition.animal.Bear;
import compositionvsinheritance.a1.mediumcomposition.prop.AnimalsProperties;

public class MainAnimal {
    public static void main(String[] args) {
        Bear bear = new Bear();
        AnimalsProperties animalsProperties = new AnimalsProperties();
        animalsProperties.setAge(30);
        bear.setProperties(animalsProperties);

        System.out.println(bear.getProperties().getAge());

    }
}