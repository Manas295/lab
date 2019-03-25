package com.spring.beans.xml;
public class Department {
     
    private long id;
    private String name;
     
    public Department() {
        super();
    }
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }
}