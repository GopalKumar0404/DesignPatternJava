package org.gopal.singleton;

public enum StudentEnum {
    INSTANCE;
//    INSTANCE("Raja","R202402","COC");
    private String name;
    private String identity;
    private String collegeName;

    StudentEnum(String name, String identity, String collegeName) {
        this.name = name;
        this.identity = identity;
        this.collegeName = collegeName;
    }

    StudentEnum() {
        name = "Gopal Kumar";
        identity = "G202001";
        collegeName = "BITS-Pilani";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
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
                "name='" + name + '\'' +
                ", identity='" + identity + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}
