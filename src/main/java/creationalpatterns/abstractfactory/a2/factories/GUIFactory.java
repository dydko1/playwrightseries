package creationalpatterns.abstractfactory.a2.factories;

import creationalpatterns.abstractfactory.a2.buttons.Button;
import creationalpatterns.abstractfactory.a2.checkboxes.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}
