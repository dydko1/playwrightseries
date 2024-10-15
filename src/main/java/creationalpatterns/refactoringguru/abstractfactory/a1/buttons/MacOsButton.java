package creationalpatterns.refactoringguru.abstractfactory.a1.buttons;

public class MacOsButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
