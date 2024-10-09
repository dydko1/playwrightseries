package creationalpatterns.abstractfactory.a2.factories;

import creationalpatterns.abstractfactory.a2.buttons.Button;
import creationalpatterns.abstractfactory.a2.buttons.MacOSButton;
import creationalpatterns.abstractfactory.a2.checkboxes.CheckBox;
import creationalpatterns.abstractfactory.a2.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckbox();
    }
}
