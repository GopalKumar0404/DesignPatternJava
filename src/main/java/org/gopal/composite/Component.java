package org.gopal.composite;

import java.util.ArrayList;
import java.util.List;

public interface Component {
    void showPrice();
    default void add(Component component){
    }
}
class Leaf implements Component{
    private final String name;
    private final int price;
    public Leaf(String name, int price){
        super();
        this.name=name;
        this.price=price;
    }
    @Override
    public void showPrice() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Leaf{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
class Composite implements  Component{
    private final String name;
    List<Component> components = new ArrayList<>();
    public Composite(String compositeName){
        this.name=compositeName;
    }
    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component component : components){
            component.showPrice();
        }
    }
    public void add(Component component) {
        System.out.println("Composite class add method working...");
        components.add(component);
    }
}
