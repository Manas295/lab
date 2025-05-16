package com.design.patterns.structural.composite;
import java.util.List;
import java.util.ArrayList;

interface OrganizationComponent {
    String getName();
    int getHours();
}

class Employee implements OrganizationComponent {
    private String name;
    private int hours;

    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }
}

class Department implements OrganizationComponent {
    private String name;
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        int totalHours = 0;
        for (OrganizationComponent component : components) {
            totalHours += component.getHours();
        }
        return totalHours;
    }

    public void addComponent(OrganizationComponent component) {
        components.add(component);
    }
}

public class DesignGuruExampleCompositePattern {
    public static void main(String[] args) {
        Department developmentDepartment = new Department("Development");
        Department pythondevelopmentDepartment = new Department("Python Development");
        Department AidevelopmentDepartment = new Department( "AI Development");

        Department marketingDepartment = new Department("Marketing");

        Employee john = new Employee("John", 40);
        Employee jane = new Employee("Jane", 35);
        Employee mike = new Employee("Mike", 30);

        developmentDepartment.addComponent(pythondevelopmentDepartment);
        developmentDepartment.addComponent(AidevelopmentDepartment);

        developmentDepartment.addComponent(john);
        developmentDepartment.addComponent(jane);
        marketingDepartment.addComponent(mike);

        System.out.println("Total Hours in Development Department: " + developmentDepartment.getHours());
        System.out.println("Total Hours in Marketing Department: " + marketingDepartment.getHours());
    }
}
