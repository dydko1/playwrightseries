package creationalpatterns.refactoringguru.abstractfactory.a1.factories;

import creationalpatterns.refactoringguru.abstractfactory.a1.buttons.Button;
import creationalpatterns.refactoringguru.abstractfactory.a1.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}