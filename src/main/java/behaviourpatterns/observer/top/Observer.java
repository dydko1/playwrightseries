package behaviourpatterns.observer.top;

import behaviourpatterns.observer.helper.Message;

public interface Observer {
    void update(Message m);
}