

public class NonImmutableClassSubject {
	private String subjects	= "";
	
	public void addSubjects(String subjectName) {
		subjects	= subjects + "," + subjectName;
	}
	
	public void setSubjects(String subjects) {
		this.subjects	= subjects;
	}
	
	public String getSubjects() {
		return subjects;
	}
}
