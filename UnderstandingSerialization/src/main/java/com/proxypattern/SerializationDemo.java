package com.proxypattern;
public class SerializationDemo {

 public static void main(String[] args) {
  // Creating and initializaing a Person object
    Person person = new Person("User1", 1, 22);
    // file name
    final String fileName = "person.ser";
    System.out.println("About to serialize ....");
    // serializing
    Util.serialzeObject(person, fileName);
    
    try {
     System.out.println("About to deserialize ....");
     // deserializing
     person = (Person)Util.deSerialzeObject(fileName);
     System.out.println("id " + person.getId() + " Name "+ person.getName() 
       + " Age " + person.getAge());
    } catch (ClassNotFoundException e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
    }
 }
}