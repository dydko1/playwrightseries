package creationalpatterns.abstractfactory.a1.factories;

import creationalpatterns.abstractfactory.a1.buttons.Button;
import creationalpatterns.abstractfactory.a1.buttons.WindowsButton;
import creationalpatterns.abstractfactory.a1.checkboxes.Checkbox;
import creationalpatterns.abstractfactory.a1.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
