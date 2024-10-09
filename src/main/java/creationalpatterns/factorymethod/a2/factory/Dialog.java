package creationalpatterns.factorymethod.a2.factory;

import creationalpatterns.factorymethod.a2.button.Button;

public abstract class Dialog {

    public void render() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
