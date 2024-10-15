package creationalpatterns.refactoringguru.abstractfactory.a2;

import creationalpatterns.refactoringguru.abstractfactory.a2.app.Application;
import creationalpatterns.refactoringguru.abstractfactory.a2.factories.GUIFactory;
import creationalpatterns.refactoringguru.abstractfactory.a2.factories.MacOSFactory;
import creationalpatterns.refactoringguru.abstractfactory.a2.factories.WindowsFactory;

public class DemoAbs1 {

    public static Application createApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else
            factory = new WindowsFactory();
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        createApplication().paint();
    }
}
