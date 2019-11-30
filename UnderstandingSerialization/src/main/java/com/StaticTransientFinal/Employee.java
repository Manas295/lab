package com.StaticTransientFinal;

import java.io.Serializable;
public class Employee extends superEmployee implements variableConstant{
	
	public Employee() {
		System.out.println("Employee constructor is called");
	}
  public String firstName;
  private static final long serialVersionUID = 5462223600l;
}
class superEmployee implements Serializable{
	
	public superEmployee() {
		System.out.println("superEmployee constructor is called.");
	}
	
  public String lastName; // Will get serialized
  
  static  String companyName; //Will not get serialized, its static and not initialized.
  
  static String Country	= "India"; // Will get serialized, as it is static but it is initialized here.
  
  transient  String address; // Will not get serialized, it is transient
  
  static transient String companyCEO; //Will not get serialized, it is static and its not initialized. transient have no use here.
  
  static transient int id	= 10; // Will get serialized , it is static and it is initialized. Transient have no use here.
   
  final transient String religion	= "Hindu"; //Will get serialized as it is final, transient have no use here.
}

interface variableConstant  {
	  public static final String education = "MCA";
	  }