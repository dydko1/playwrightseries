package behaviourpatterns.observer;

import behaviourpatterns.observer.helper.Message;
import behaviourpatterns.observer.top.ConcreteObserver;
import behaviourpatterns.observer.top.ConcreteSubject;
import behaviourpatterns.observer.top.Observer;
import behaviourpatterns.observer.top.Subject;

public class MainObs {
    public static void main(String[] args) {
        Observer sub1 = new ConcreteObserver("Temat 1");
        Observer sub2 = new ConcreteObserver("Temat 2");
        Observer sub3 = new ConcreteObserver("Temat 3");

        Subject p = new ConcreteSubject();

        p.attach(sub1);
        p.attach(sub2);
        p.notifyUpdate(new Message("Pierwsza wiadomość"));

        p.detach(sub1);
        p.attach(sub3);
        p.notifyUpdate(new Message("Druga wiadomość"));

    }
}