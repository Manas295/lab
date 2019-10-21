package com.eof.exception.scenario;

import java.io.Serializable;

class Employee implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String name;
 
    public Employee(String name) {
           this.name = name;
    }
 
    @Override
    public String toString() {
           return "Employee [name=" + name + "]";
    }
 
}