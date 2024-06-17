package org.gopal.iterator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User[]{new User("Gopal", "G0101"),
                new User("Raja","R0101")});
        List<User> users2 = Arrays.asList(new User("Demo", "G0101"), new User("Raja", "R0101"));
        MyIterator iterator = new MyIteratorImpl(users2);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        iterator = new MyIteratorImpl(users);
        while(iterator.hasNext()){
            System.out.println(iterator.next().hashCode());
        }
    }
}
