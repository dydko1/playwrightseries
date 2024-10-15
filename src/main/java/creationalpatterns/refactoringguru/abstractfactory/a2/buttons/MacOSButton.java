package creationalpatterns.refactoringguru.abstractfactory.a2.buttons;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
