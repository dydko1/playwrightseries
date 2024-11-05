package behaviourpatterns.observer.exam01.top;

import behaviourpatterns.observer.exam01.helper.Message;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyUpdate(Message m);
}