package creationalpatterns.abstractfactory.a1.factories;

import creationalpatterns.abstractfactory.a1.buttons.Button;
import creationalpatterns.abstractfactory.a1.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}