package creationalpatterns.factorymethod.a1.factory;

import creationalpatterns.factorymethod.a1.buttons.Button;
import creationalpatterns.factorymethod.a1.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
