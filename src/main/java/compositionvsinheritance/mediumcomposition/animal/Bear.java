package compositionvsinheritance.a1.mediumcomposition.animal;

import compositionvsinheritance.a1.mediumcomposition.prop.AnimalsProperties;
import compositionvsinheritance.a1.mediumcomposition.prop.UniqueAnimalsProperties;

public class Bear {

    private AnimalsProperties properties;
    private UniqueAnimalsProperties uniqueAnimalsProperties;

    public Bear() {
        this.properties = new AnimalsProperties();
        this.uniqueAnimalsProperties = new UniqueAnimalsProperties();
    }

    public AnimalsProperties getProperties() {
        return properties;
    }

    public void setProperties(AnimalsProperties properties) {
        this.properties = properties;
    }

    public UniqueAnimalsProperties getUniqueAnimalsProperties() {
        return uniqueAnimalsProperties;
    }

    public void setUniqueAnimalsProperties(UniqueAnimalsProperties uniqueAnimalsProperties) {
        this.uniqueAnimalsProperties = uniqueAnimalsProperties;
    }
}