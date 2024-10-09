package creationalpatterns.factorymethod.a1.factory;

import creationalpatterns.factorymethod.a1.buttons.Button;
import creationalpatterns.factorymethod.a1.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}