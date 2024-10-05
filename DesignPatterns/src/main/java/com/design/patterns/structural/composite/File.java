package com.design.patterns.structural.composite;
/*
 2. Leaf Objects
    These represent individual objects (files):
 */
public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
