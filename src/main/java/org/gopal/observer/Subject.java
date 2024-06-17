package org.gopal.observer;

public interface Subject {
    void register(Observer subscriber);

    void deRegister(Observer subscriber);

    void notifySubscriber(String titleOfVideo);

    void uploadVideo(String title);
}
