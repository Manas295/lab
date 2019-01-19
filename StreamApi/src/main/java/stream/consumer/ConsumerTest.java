package stream.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import io.stream.test.Employee;

public class ConsumerTest {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Shawn",200,34),
				new Employee("jimmy",500,34),
				new Employee("Kevin",700,34),
				new Employee("Disha",900,34)
				);
		printAll(list,emp -> System.out.println(emp));	

	}
	static void printAll(List<Employee> emplist ,Consumer<Employee> consumer) {       
		for(Employee emp : emplist)
		{

			consumer.accept(emp);	
		}
	}

}
