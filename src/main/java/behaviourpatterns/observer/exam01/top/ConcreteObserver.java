package behaviourpatterns.observer.exam01.top;

import behaviourpatterns.observer.exam01.helper.Message;

public class ConcreteObserver implements Observer {

    String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Message m) {
        System.out.println(name + ": " + m.getMessageContent());
    }
}