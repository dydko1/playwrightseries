package creationalpatterns.abstractfactory.a1.checkboxes;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
