/*
 -------------KEY REQUIREMENTS FOR IMMUTABLE CLASS-------------------
 1 - The class must be declared as final so that child classes can’t be created.
 2 - Data members in the class must be declared private so that direct access is not allowed.
 3 - Data members in the class must be declared as final so that we can’t change the value 
 	 of it after object creation.
 4 - A parameterized constructor should initialize all the fields performing a deep copy 
 	 so that data members can’t be modified with an object reference.
 5 - Deep Copy of objects should be performed in the getter methods to return a copy 
 	 rather than returning the actual object reference)
 */


public final class StrongImmutableClass {

	final String name;
	final int age;
	final NonImmutableClassSubject subject;
	
	public StrongImmutableClass(String name,int age,NonImmutableClassSubject subject) {
		this.name	= name;
		this.age	= age;
		this.subject	= new NonImmutableClassSubject();
		this.subject.setSubjects(subject.getSubjects());
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getAllSubjects() {
		return this.subject.getSubjects();
	}
	
	public void displayStudentdetails() {
		System.out.println("Name="+this.name+",age="+this.age+",Subjects="+subject.getSubjects());
	}
}