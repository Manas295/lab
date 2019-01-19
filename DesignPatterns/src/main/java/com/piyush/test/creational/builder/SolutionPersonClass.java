package com.piyush.test.creational.builder;

public class SolutionPersonClass {

    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    
    public SolutionPersonClass(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public static class Builder {
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;
        
        public Builder(){}
        
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        
        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }
        
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        
        public SolutionPersonClass build() {
            return new SolutionPersonClass(firstName, middleName, lastName, age);
        }
    }
}
