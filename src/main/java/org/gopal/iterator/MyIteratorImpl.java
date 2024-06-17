package org.gopal.iterator;

import java.util.List;

public class MyIteratorImpl implements MyIterator{
    private int position;
    private List<User> users;

    public MyIteratorImpl(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean hasNext() {
        if(users.size()>position)
            return true;
        return false;
    }

    @Override
    public Object next() {
        User user = users.get(position++);
        return user;
    }
}
