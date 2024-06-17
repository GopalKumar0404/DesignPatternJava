package org.gopal.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private String name;
    private List<Observer> subscribers = new ArrayList<>();
    public Channel(String name){
        this.name = name;
    }
    @Override
    public void register(Observer subscriber){
        subscribers.add(subscriber);
    }
    @Override
    public void deRegister(Observer subscriber){
        subscribers.remove(subscriber);
    }
    @Override
    public void notifySubscriber(String titleOfVideo){
        for(Observer subscriber : subscribers)
            subscriber.update(titleOfVideo);
    }
    @Override
    public void uploadVideo(String title){
        System.out.println("Data saved : "+title);
        notifySubscriber(title);
    }

}
