package compositionvsinheritance.a1.mediumcomposition.animal;

import compositionvsinheritance.a1.mediumcomposition.prop.AnimalsProperties;
import compositionvsinheritance.a1.mediumcomposition.prop.UniqueAnimalsProperties;

class Lion {

  private AnimalsProperties properties;
  private UniqueAnimalsProperties uniqueProperties;

  public Lion() {
    properties = new AnimalsProperties();
    uniqueProperties = new UniqueAnimalsProperties();
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