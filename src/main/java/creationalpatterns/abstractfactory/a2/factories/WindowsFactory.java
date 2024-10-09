package creationalpatterns.abstractfactory.a2.factories;

import creationalpatterns.abstractfactory.a2.buttons.Button;
import creationalpatterns.abstractfactory.a2.buttons.WindowsButton;
import creationalpatterns.abstractfactory.a2.checkboxes.CheckBox;
import creationalpatterns.abstractfactory.a2.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckbox();
    }
}
