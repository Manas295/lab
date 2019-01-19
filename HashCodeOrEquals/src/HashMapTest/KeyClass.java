package HashMapTest;

public class KeyClass {
	
	String name;
	public KeyClass(String name) {
		this.name	= name;
	}

	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
