package org.gopal.builder;

public class Main {
    public static void main(String[] args) {

        Student student = Student.builder().studentName("Gopal").collegeName("BITS-Pilani");
        System.out.println(student);
        System.out.println(student.getCollegeName());
    }
}
