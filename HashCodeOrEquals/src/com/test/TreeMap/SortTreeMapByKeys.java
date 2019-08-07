package com.test.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class SortTreeMapByKeys {
	public static void main(String[] args) {
		//TreeMap<Employee,String> records	= new TreeMap<Employee,String>(new MyComparator());
	   //	TreeMap<Employee,String> records	= new TreeMap<Employee,String>();

		//JAVA 8 Comparator.comparing
		TreeMap<Employee,String> records	= new TreeMap<Employee,String>(Comparator.comparing(Employee::getId));
		records.put(new Employee("Ramesh",5),"DEV");
		records.put(new Employee("Aman",1),"DEV");
		records.put(new Employee("Zayan",2),"DEV");
		records.put(new Employee("Ritesh",4),"DEV");

		System.out.println(records);
	}
}

class MyComparator implements Comparator<Employee>{


	//THIS WILL SORT BY ID
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.id > o2.id) {
			return 1;
		}else if(o2.id > o1.id) {
			return -1;
		}else {
			return 0;
		}
	}
}


//This should implement comparable if comparator is not given in constructor
/*class Employee implements Comparable<Employee>{

	public int id;
	public String name;

	public Employee(String name,int id) {
		this.name	= name;
		this.id		= id;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}


	//THIS WILL SORT BY NAME AS A DEFAULT NATURAL ODERING
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
		//return this.id - o.id;
	}

	@Override
	public String toString() {
		return ""+this.name + " " + this.id;
	}
}*/

/**************************************************************************/

// Employee Class in case we are providing Comparator class in constructor
class Employee{
	public int id;
	public String name;

	public Employee(String name,int id) {
		this.name	= name;
		this.id		= id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return ""+this.name + " " + this.id;
	}
}
