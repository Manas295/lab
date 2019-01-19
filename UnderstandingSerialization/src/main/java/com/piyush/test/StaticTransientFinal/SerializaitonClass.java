package com.piyush.test.StaticTransientFinal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class SerializaitonClass {
  public static void main(String[] args) {
	Employee emp = new Employee();
	
    emp.firstName = "Vivekanand";
    emp.lastName = "Gautam";
    Employee.companyName = "JBT";
    emp.address = "MUM";
    Employee.companyCEO = "ME CEO";
    
    //Trying to override static variable "country"
    Employee.Country	= "USA";
    
    //Trying to override static and transient variable "ID"
    Employee.id			= 11;
    
    try {
      FileOutputStream fileOut = new FileOutputStream("./employee.txt");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(emp);
      out.close();
      fileOut.close();
      System.out.printf("Serialized data is saved in ./employee.txt file");
    } catch (IOException i) {
      i.printStackTrace();
    }
  }
}