package creationalpatterns.abstractfactory.a2.app;

import creationalpatterns.abstractfactory.a2.buttons.Button;
import creationalpatterns.abstractfactory.a2.checkboxes.CheckBox;
import creationalpatterns.abstractfactory.a2.factories.GUIFactory;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
