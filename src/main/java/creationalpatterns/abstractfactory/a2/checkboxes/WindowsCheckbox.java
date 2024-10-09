package creationalpatterns.abstractfactory.a2.checkboxes;

public class WindowsCheckbox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
