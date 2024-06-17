package org.gopal.observer;

public interface Observer {
    void update(String str);

    void subscribe(Subject ch);

    void unSubscribe(Subject ch);
}
