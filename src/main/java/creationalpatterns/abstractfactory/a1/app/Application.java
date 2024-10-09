package creationalpatterns.abstractfactory.a1.app;

import creationalpatterns.abstractfactory.a1.buttons.Button;
import creationalpatterns.abstractfactory.a1.checkboxes.Checkbox;
import creationalpatterns.abstractfactory.a1.factories.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
