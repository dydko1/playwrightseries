package creationalpatterns.abstractfactory.a1.factories;

import creationalpatterns.abstractfactory.a1.buttons.Button;
import creationalpatterns.abstractfactory.a1.buttons.MacOsButton;
import creationalpatterns.abstractfactory.a1.checkboxes.Checkbox;
import creationalpatterns.abstractfactory.a1.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
