package stream.apis.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListUniqueEmployeeByNameUsingCustomeDistinctLogic {
	public static void main(String[] args) {
		List<Employees> empList = Arrays.asList(new Employees("E001", 40, "Ram", 'M', 5000), 
				new Employees("E002", 35, "Shelly", 'F', 7000), 
				new Employees("E001", 40, "Ram", 'M', 5000), 
				new Employees("E004", 37, "Rani", 'F', 11000),
				new Employees("E002", 35, "Shelly", 'F', 7000), 
				new Employees("E006", 28, "Amy", 'F', 14000));  
	
		List<Employees> distinctPeople = empList.stream()
				.filter( distinctByKey(p -> p.getName()))
				.collect( Collectors.toList() );
		distinctPeople.forEach(entry->System.out.println(entry.getEmpId()+"------"+entry.getName()));
	
		//----------------------WAY 2 -- NEED TO OVERRIDE HASHCODE AND EQUALS---------------------------
	//    empList.stream().distinct().forEach(System.out::println);

	}
	/*
	   The distinctByKey() function uses a ConcurrentHashMap instance to 
	   find out if there is an existing key with the same value – 
	   where the key is obtained from a function reference.

	   The parameter to this function is a lambda expression used to 
	   generate the map key for the comparison. If the used key is a 
	   custom type, do not forget to override the hashCode() and equals() method.
	 */

	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) 
	{
		Map<Object, Boolean> map = new ConcurrentHashMap<>();
		return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
}

class Employees {
	private String empId;
	private int age;
	private String name;
	private char gender;
	private int salary;
	Employees(String empId, int age, String name, char gender, int salary){
		this.empId = empId;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Emp Id: " +  getEmpId() + " Name: " + getName();
	}
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	// Equality based on id and name
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
}