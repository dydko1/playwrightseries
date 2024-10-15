package creationalpatterns.refactoringguru.factorymethod.a2.factory;

import creationalpatterns.refactoringguru.factorymethod.a2.button.Button;
import creationalpatterns.refactoringguru.factorymethod.a2.button.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
