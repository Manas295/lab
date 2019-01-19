package stream.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import io.stream.test.Employee;

/* Supplier<T> is an in-built functional interface introduced in Java8 in the java.util.function package. 
 * The supplier can be used in all contexts where there is no input but an output is expected. 
 * Since Supplier is a functional interface, hence it can be used as the assignment target for a 
 * lambda expression or a method reference.
 */


public class SupplierTest {

	public static void main(String[] args) {
		//1	
		List<Employee> list = Arrays.asList(new Employee("Shawn",200,34),
				new Employee("jimmy",500,34),
				new Employee("Kevin",700,34),
				new Employee("Disha",900,34)
				);
		list.stream().forEach((employee)->printAll(()->employee));
		//2
		Supplier<Employee> supplier = () ->{
			return new Employee("Supplier", 6000, 23);
		};
		Employee emp = supplier.get();
		System.out.println(emp.toString());

	}

	private static void printAll(Supplier<Employee> emp) {
		System.out.println(emp.get());
	}


}
