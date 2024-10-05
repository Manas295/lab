package com.design.patterns.structural.composite;
public class CompositePatternDemo {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");

        Directory directory1 = new Directory("dir1");
        directory1.addComponent(file1);

        Directory directory2 = new Directory("dir2");
        directory2.addComponent(file2);
        directory2.addComponent(directory1);

        directory2.showDetails();
    }
}
