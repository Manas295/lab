package annotation.value;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${name}")
	private String name;
	@Value("${age}")
	private int age;
	
	public void printData() {
		System.out.println("Name is ["+name+"] Age is ["+age+"]");
	}
}