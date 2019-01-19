package io.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Manas", 4000, 23),new Employee("Piyush", 5000, 23),
				new Employee("Manu", 5000, 23),new Employee("Sameer", 5000, 23),
				new Employee("Nipun", 1000, 23),new Employee("Kanika", 3000, 23),
				new Employee("Sagar", 2000, 23),new Employee("Santosh", 6000, 23));
		
		List<Employee> employee = list.stream().filter(emp->emp.getSalary()>3000).collect(Collectors.toList());
		employee.forEach(System.out::println);
		
		Optional<String> name = list.stream().filter(emp->emp.getSalary()>5000).map(Employee :: getName).findAny();
		System.out.println("Name -----> "+name.get());
		
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
		//List<Double> num = costBeforeTax.stream().map(cost -> cost + .12*cost).collect(Collectors.toList());
		costBeforeTax.stream().map(cost -> cost + .12*cost).forEach(System.out::println);
		double bill = costBeforeTax.stream().map(cost -> cost + .12*cost).reduce((sum,cost) -> sum+cost).get();
		System.out.println("DOUBLE "+bill);
		
		
		
	}

}
