package stream.apis.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindHighestSalaryOfEmployee {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("John", 500000),
				new Employee("Jane", 500000),
				new Employee("John", 750000),
				new Employee("Jack", 600000),
				new Employee("Jill", 800000));
		Optional<Employee> NthHighestSalary = employees.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed())
		.skip(0) //N-1 
		.findFirst();
		 System.out.println("Highest Salary : "+NthHighestSalary.get().getSalary());
	}

}
