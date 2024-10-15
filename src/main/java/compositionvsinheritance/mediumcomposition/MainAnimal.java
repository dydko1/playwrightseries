package compositionvsinheritance.mediumcomposition;

import compositionvsinheritance.mediumcomposition.animal.Bear;
import compositionvsinheritance.mediumcomposition.prop.AnimalsProperties;

public class MainAnimal {
    public static void main(String[] args) {
        Bear bear = new Bear();
        AnimalsProperties animalsProperties = new AnimalsProperties();
        animalsProperties.setAge(30);
        bear.setProperties(animalsProperties);

        System.out.println(bear.getProperties().getAge());

    }
}