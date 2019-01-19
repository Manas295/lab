

import java.util.HashMap;


public class ImmutableClassWithBuilder{
	public static void main(String[] args) {
		ImmutableClass immutableClass = new ImmutableClass.ImmutableClassBuilder(1, "Pankaj").build();
		
		HashMap<String,String> hm = new HashMap<String, String>();
		hm.put("Name", "Pankaj");
		hm.put("City", "San Jose");
		// Getting immutable class with optional parameters
		ImmutableClass immutableClass1 = new ImmutableClass.ImmutableClassBuilder(1, "Pankaj")
                                                     .setCompany("Apple").setProperties(hm).build();
		
		//Testing immutability
		HashMap<String,String> hm1 = immutableClass1.getProperties();
		
		//lets modify the Object passed as argument or get from the Object
		hm1.put("test", "test");
		hm.put("test", "test");
		
		//check that immutable class properties are not changed
		System.out.println(immutableClass1.getProperties());
	}
}

class ImmutableClass {

	//required fields
	private int id;
	private String name;

	//optional fields
	private HashMap<String, String> properties;
	private String company;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HashMap<String, String> getProperties() {
		//return cloned object to avoid changing it by the client application
		return (HashMap<String, String>) properties.clone();
	}

	public String getCompany() {
		return company;
	}

	private ImmutableClass(ImmutableClassBuilder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.properties = builder.properties;
		this.company = builder.company;
	}

	//Builder class
	public static class ImmutableClassBuilder{
		//required fields
		private int id;
		private String name;

		//optional fields
		private HashMap<String, String> properties;
		private String company;

		public ImmutableClassBuilder(int i, String nm){
			this.id=i;
			this.name=nm;
		}

		public ImmutableClassBuilder setProperties(HashMap<String,String> hm){
			this.properties = (HashMap<String, String>) hm.clone();
			return this;
		}

		public ImmutableClassBuilder setCompany(String comp){
			this.company = comp;
			return this;
		}

		public ImmutableClass build(){
			return new ImmutableClass(this);
		}
	}
}
