
/*
 * WeakImmutableClass is not final
 * But all methods should be final so that they can not get override.
 */
public class WeakImmutableClass {

	final String name;
	final int age;
	final NonImmutableClassSubject subject;
	
	public WeakImmutableClass(String name,int age,NonImmutableClassSubject subject) {
		this.name	= name;
		this.age	= age;
		
		/*
		 * Making its own copy of mutable class object to prevent 
		 * immutable nature of this(WeakImmutableClass) class.
		 */
		
		this.subject	= new NonImmutableClassSubject();
		this.subject.setSubjects(subject.getSubjects());
	}
	
	final public String getName() {
		return this.name;
	}
	
	final public int getAge() {
		return this.age;
	}
	
	final public NonImmutableClassSubject getSubjects() {
		return this.subject;
	}
	
	final public void displayStudentdetails() {
		System.out.println("Name="+this.name+",age="+this.age+",Subjects="+subject.getSubjects());
	}
}