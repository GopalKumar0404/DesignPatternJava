package org.gopal.observer;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer {
    private String name;
    private List<Subject> channels = new ArrayList<>();
    public Subscriber(String name){
        this.name = name;
    }
    @Override
    public void update(String str){
        System.out.println("Hey "+name+"! New video uploaded : "+ str);
    }

    @Override
    public void subscribe(Subject ch){
        channels.add(ch);
        ch.register(this);
    }
    @Override
    public void unSubscribe(Subject ch){
        channels.remove(ch);
        ch.deRegister(this);
    }
}
