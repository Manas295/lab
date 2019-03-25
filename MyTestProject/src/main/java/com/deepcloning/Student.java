package com.deepcloning;

public class Student  implements Cloneable{
	String id;
	String name;
	Course course;
	public Student(String id, String name, Course course)
	{
		this.id = id;
		this.name = name;
		this.course = course;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		/*course	= (Course)course.clone();
		return super.clone();*/
		Student student = (Student) super.clone();
		student.course = (Course)course.clone();
		return student;
	}


}
