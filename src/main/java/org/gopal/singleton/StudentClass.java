package org.gopal.singleton;

import java.io.Serializable;

public class StudentClass implements Serializable,Cloneable {
    private String name;
    private String identity;
    private String collegeName;
    private static StudentClass instance;

    private StudentClass() {
        if(instance!=null){
            throw new RuntimeException("Reflection api is getting used to break Singleton Pattern");
        }
        this.name = "Gopal Kumar";
        this.identity = "G202001";
        this.collegeName = "Commerce-College";
    }

    public static StudentClass getInstance() {
        if (instance == null) {
            synchronized (StudentClass.class) {
                if (instance == null)
                    instance= new StudentClass();
            }
        }
        return instance;
    }

    public Object readResolve(){
        System.out.println("ReadResolve method working....");
        return getInstance();
    }


    public Object clone() throws CloneNotSupportedException {
        return getInstance();
    }

}
