package io.stream.test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
	
	public Employee(String name,int salary,int age)
	{
		this.name = name;
		this.salary = salary;
		this.age = age;
		
	}
	public String name;
	public int salary;
	public int age;
	
}
