package compositionvsinheritance.a1.mediumcomposition.animal;

import compositionvsinheritance.a1.mediumcomposition.prop.AnimalsProperties;
import compositionvsinheritance.a1.mediumcomposition.prop.UniqueAnimalsProperties;

public class Tiger {

    private AnimalsProperties properties;
    private UniqueAnimalsProperties uniqueProperties;

    public Tiger() {
        this.properties = new AnimalsProperties();
        this.uniqueProperties = new UniqueAnimalsProperties();
    }

    public AnimalsProperties getProperties() {
        return properties;
    }

    public void setProperties(AnimalsProperties properties) {
        this.properties = properties;
    }

    public UniqueAnimalsProperties getUniqueProperties() {
        return uniqueProperties;
    }

    public void setUniqueProperties(UniqueAnimalsProperties uniqueProperties) {
        this.uniqueProperties = uniqueProperties;
    }
}