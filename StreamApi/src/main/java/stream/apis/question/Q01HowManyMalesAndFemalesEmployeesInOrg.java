package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q01HowManyMalesAndFemalesEmployeesInOrg {
	public static void main(String[] args) {
		  List<Employee> employees = Arrays.asList(
		            new Employee(1, "John Doe", 30, "Male", 50000),
		            new Employee(2, "Jane Smith", 25, "Female", 20000),
		            new Employee(3, "Mike Johnson", 40, "Male", 70000),
		            new Employee(4, "Emily Davis", 35, "Female", 30000),
		            new Employee(5, "Robert Brown", 50, "Male", 90000)
		        );
		  
		  Map<String, Long> genderCount = employees.stream().
				  collect(Collectors.groupingBy(Employee :: getGender,Collectors.counting()));
		  
		  
		  //https://www.netjstech.com/2022/04/java-stream-collectors-summingint-summinglong.html
		  //https://www.netjstech.com/2022/04/java-stream-collectors-averagingint-averagingdouble.html
		  //Java Stream - Collectors.summingInt(), summingLong(), summingDouble().
		  //Java Stream - Collectors.averagingInt(), averagingLong(), averagingDouble()
		  Map<String, Double> averageSalary = employees.stream().
				  collect(Collectors.groupingBy(Employee::getGender, 
						  Collectors.averagingDouble(Employee::getSalary)));
		  System.out.println("Gender Count: " + genderCount);
	      System.out.println("Average Salary: " + averageSalary);
	}
}