package creationalpatterns.refactoringguru.abstractfactory.a2.checkboxes;

public class MacOSCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
