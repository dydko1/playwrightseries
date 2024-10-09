package creationalpatterns.factorymethod.a1.factory;

import creationalpatterns.factorymethod.a1.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}