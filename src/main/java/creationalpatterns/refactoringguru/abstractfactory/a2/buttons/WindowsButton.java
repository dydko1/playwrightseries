package creationalpatterns.refactoringguru.abstractfactory.a2.buttons;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
