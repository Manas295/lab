
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