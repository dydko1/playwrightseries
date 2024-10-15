package creationalpatterns.refactoringguru.abstractfactory.a1;

import creationalpatterns.refactoringguru.abstractfactory.a1.app.Application;
import creationalpatterns.refactoringguru.abstractfactory.a1.factories.GUIFactory;
import creationalpatterns.refactoringguru.abstractfactory.a1.factories.MacOSFactory;
import creationalpatterns.refactoringguru.abstractfactory.a1.factories.WindowsFactory;

public class DemoAbs {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (!osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
