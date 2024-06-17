package org.gopal.builder;

public class Student {
    private String StudentName;
    private int id;
    private String department;
    private String collegeName;

    public static Student builder(){
        return new Student();
    }
    public Student studentName(String studentName){
        this.setStudentName(studentName);
        return this;
    }public Student id(int id){
        this.setId(id);
        return this;
    }public Student department(String department){
        this.setDepartment(department);
        return this;
    }public Student collegeName(String collegeName){
        this.setCollegeName(collegeName);
        return this;
    }
    public Student build(){
        Student student = this;
        return student;
    }
    public Student() {
    }

    public Student(String studentName, int id, String department, String collegeName) {
        StudentName = studentName;
        this.id = id;
        this.department = department;
        this.collegeName = collegeName;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentName='" + StudentName + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}
