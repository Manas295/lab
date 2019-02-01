package com.shallowcloning;

public class ShallowcloningMain {
	public static void main(String[] args) {
		Course course = new Course("Maths","Data Structure","Java");
		Student std = new Student("123","Manas",course);

		Student std1 = null;
		try {
			std1 = (Student) std.clone();
		}
		catch(CloneNotSupportedException exp)
		{
			exp.printStackTrace();
		}
	
		System.out.println("Student 1  "+std.course.subject1);
		std1.course.subject1="English";
		System.out.println("Student 1  "+std.course.subject1);

	}

}

