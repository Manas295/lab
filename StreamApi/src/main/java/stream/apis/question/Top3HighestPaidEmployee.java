package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Top3HighestPaidEmployee {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(1, "Alice",38,"M", 70000),
				new Employee(2, "Bob",38,"M", 85000),
				new Employee(3, "Charlie",38,"M", 60000),
				new Employee(4, "David",38,"M", 95000),
				new Employee(5, "Eve",38,"M", 120000)
				);


		List<Employee> topPaidEmployees = employees.stream()
				.sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
				.limit(3)
				.collect(Collectors.toList());
		topPaidEmployees.forEach(System.out::println);
	}

}
