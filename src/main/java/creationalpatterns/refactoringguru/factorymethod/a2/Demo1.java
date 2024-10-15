package creationalpatterns.refactoringguru.factorymethod.a2;

import creationalpatterns.refactoringguru.factorymethod.a2.factory.Dialog;
import creationalpatterns.refactoringguru.factorymethod.a2.factory.HtmlDialog;
import creationalpatterns.refactoringguru.factorymethod.a2.factory.WindowsDialog;

public class Demo1 {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }


    private static void configure() {
        if (!System.getProperty("os.name").equals("Windows 10"))
            dialog = new WindowsDialog();
        else
            dialog = new HtmlDialog();
    }

    private static void runBusinessLogic() {
        dialog
                .render();
    }
}