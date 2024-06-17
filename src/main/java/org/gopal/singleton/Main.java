package org.gopal.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        StudentEnum studentEnum = StudentEnum.INSTANCE;
        System.out.println(studentEnum.hashCode());

        StudentClass studentClass = StudentClass.getInstance();
        StudentClass studentClass2;
        StudentClass studentClass3 = (StudentClass) studentClass.clone();
        System.out.println("hashcode for first Instance : "+studentClass.hashCode());
        System.out.println("hashcode for third Instance : "+studentClass3.hashCode());
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.txt"));
            objectOutputStream.writeObject(studentClass);

            System.out.println("Serialization done....");
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));
            studentClass2 =(StudentClass) objectInputStream.readObject();
            System.out.println("Deserialization Done");
            System.out.println("hashcode for second Instance : "+studentClass2.hashCode());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
