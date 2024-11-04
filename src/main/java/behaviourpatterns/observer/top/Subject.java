package behaviourpatterns.observer.top;

import behaviourpatterns.observer.helper.Message;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyUpdate(Message m);
}