package behaviourpatterns.observer.exam03;

import behaviourpatterns.observer.exam03.editor.Editor;
import behaviourpatterns.observer.exam03.listeners.EmailNotificationListener;
import behaviourpatterns.observer.exam03.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("src/test/resourcesfile.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}