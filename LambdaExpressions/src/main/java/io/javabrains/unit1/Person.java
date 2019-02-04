package io.javabrains.unit1;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
	private String firstName;
	private String lastName;
	private int age;


	public Person(String firstName,String lastName,int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
}
