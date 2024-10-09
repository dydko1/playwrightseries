package creationalpatterns.factorymethod.a2.factory;

import creationalpatterns.factorymethod.a2.button.Button;
import creationalpatterns.factorymethod.a2.button.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
