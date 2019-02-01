package com.shallowcloning;

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
		/*return super.clone();*/
		Student student = (Student) super.clone();
		return student;
	}


}
