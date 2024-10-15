package creationalpatterns.refactoringguru.factorymethod.a2.factory;

import creationalpatterns.refactoringguru.factorymethod.a2.button.Button;

public abstract class Dialog {

    public void render() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
