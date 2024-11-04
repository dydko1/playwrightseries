package behaviourpatterns.observer.top;

import behaviourpatterns.observer.helper.Message;

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