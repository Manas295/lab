package stream.apis.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Q07FindHighestSalaryOfEmployee {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
	            new Employee(1, "John Doe", 30, "Male", 50000),
	            new Employee(2, "Jane Smith", 25, "Female", 20000),
	            new Employee(3, "Mike Johnson", 40, "Male", 70000),
	            new Employee(4, "Emily Davis", 35, "Female", 30000),
	            new Employee(5, "Robert Brown", 50, "Male", 90000)
	        );

		Optional<Employee> NthHighestSalary = employees.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed())
		.skip(0) //N-1 
		.findFirst();
		 System.out.println("Highest Salary : "+NthHighestSalary.get().getSalary());
		 
		 //Transforming Stream to primitive type Stream
		 //average, sum, min (without specifying a comparator), max (without specifying a comparator) 
		 //are not provided for Stream with object references. Since these operations are 
		 //used quite frequently with streams so you will do this transformation using mapToxxx 
		 //methods a lot if time.
		 OptionalDouble max = employees.stream().mapToDouble(e->e.getSalary()).max();
		 System.out.println(max.getAsDouble());
		 
		 double sum = employees.stream().mapToDouble(e->e.getSalary()).sum();
		 System.out.println(sum);
	}

}
