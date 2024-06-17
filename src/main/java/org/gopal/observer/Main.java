package org.gopal.observer;

public class Main {
    public static void main(String[] args) {
        Observer s1 = new Subscriber("Gopal");
        Observer s2 = new Subscriber("Raja");
        Observer s3 = new Subscriber("Ram");

        Subject ch = new Channel("GopalTech");
        s1.subscribe(ch);
        s2.subscribe(ch);
        s3.subscribe(ch);

        ch.uploadVideo("How to create observer design pattern Learning");
        s1.unSubscribe(ch);
        ch.uploadVideo("I'm practicing observer design patter");
    }
}
