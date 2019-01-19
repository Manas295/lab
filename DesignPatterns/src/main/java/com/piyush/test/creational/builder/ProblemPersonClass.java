package com.piyush.test.creational.builder;

public class ProblemPersonClass {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public ProblemPersonClass(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }
    public ProblemPersonClass(String firstName, String lastName, int age) {
        this(firstName, null, lastName, age);
    }
    public ProblemPersonClass(String firstName, int age) {
        this(firstName, null, age);
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}