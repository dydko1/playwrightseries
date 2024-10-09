package creationalpatterns.factorymethod.a2.factory;

import creationalpatterns.factorymethod.a2.button.Button;
import creationalpatterns.factorymethod.a2.button.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
