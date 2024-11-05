package behaviourpatterns.observer.exam01;

import behaviourpatterns.observer.exam01.helper.Message;
import behaviourpatterns.observer.exam01.top.ConcreteObserver;
import behaviourpatterns.observer.exam01.top.ConcreteSubject;
import behaviourpatterns.observer.exam01.top.Observer;
import behaviourpatterns.observer.exam01.top.Subject;

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