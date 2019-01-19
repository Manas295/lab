public class MyMainClass {
	
	public static void main(String[] args) {
		NonImmutableClassSubject subjects	= new NonImmutableClassSubject();
		
		subjects.addSubjects("English");
		
		WeakImmutableClass piyushDetails	= new WeakImmutableClass("Piyush",25,subjects);		
		
		subjects.addSubjects("Computers");
		
		WeakImmutableClass arunDetails	= new WeakImmutableClass("Arun",27,subjects);
		
		subjects.addSubjects("Bio");
		
		StrongImmutableClass manasDetails	= new StrongImmutableClass("Manas", 10, subjects);
		
		subjects.addSubjects("Arts");
		
		StrongImmutableClass rajatDetails	= new StrongImmutableClass("Rajat", 23, subjects);
	
		
		piyushDetails.displayStudentdetails(); //This will not include Computers,Arts and Bio as a subject
		arunDetails.displayStudentdetails(); // This will not include Arts and Bio as a Subject
		manasDetails.displayStudentdetails(); //This will not include Arts as a subject
		rajatDetails.displayStudentdetails();
		
	}
}
