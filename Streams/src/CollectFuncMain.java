import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectFuncMain {
	public static void main(String[] args) {
		List<Employee> empList = createList();	
		/*In case function is a Predicate, i.e. returns a boolean-valued function it is more efficient to 
		 *use partitioningBy rather than groupingBy. As Example if you want to partition by employees 
		 *getting salary greater than or equal to 8000.
		 */
		Map<Boolean, List<Employee>> empMap = empList.stream().collect(Collectors.partitioningBy(e -> e.getSalary() >= 8000 ));
		empMap.keySet().stream().forEach(obj->{
			
			if(obj == true) {
				empMap.get(obj).stream().forEach(System.out::println);
			}
			
		});
		System.out.println("-----------------------");
		/*
		 * If you want to group the employees by gender-
		 */
		Map<Character, List<Employee>> empMap1 = empList.stream().collect(Collectors.groupingBy(Employee::getSex));
		empMap1.keySet().stream().forEach(obj->{
			empMap1.get(obj).stream().forEach(val-> System.out.println(obj+" ----->"+val));

		});
		
		System.out.println("-----------------------");
		/*
		 * If you want total salary given to all the employees -
		 */
		int totalSalary = empList.stream()
                .collect(Collectors.summingInt(Employee::getSalary));
		System.out.println("TotalSalary -> "+totalSalary);
		
		
		System.out.println("-----------------------");
		/*
		 * If you want all the names as a String, joined by comma
		 */
		String names = empList.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(","));
		System.out.println(names);
		
		/*
		 * If you want to store data in a Map so that empId is the key and name is the value.

		 */
		System.out.println("-----------------------");
		Map<String, String> nameMap = empList.stream()
                .collect(Collectors.toMap(Employee::getEmpId, Employee::getName));
		nameMap.keySet().stream().forEach(key->System.out.println(key+" Val "+nameMap.get(key)));
		
		/*
		 * If you want to specify the collection yourself, 
		 * as example you want the name to be stored in sorted order and want to use TreeSet for the purpose.
		 */
		System.out.println("-----------------------");

		Set<String> nameSet = empList.stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(TreeSet::new));
		nameSet.stream().forEach(System.out::println);
		
		System.out.println("-----------------------");
		/*
		 * If you want to store the names in the set.
		 */
		Set<String> nameSet1 = empList.stream()
                .map(Employee::getName)
                .collect(Collectors.toSet());

		System.out.println("-----------------------");
		/*
		 * If you want a list having names of all the employees you can use the 
		 * toList method of the Collectors class.
		 */
		List<String> nameList = empList.stream()
		         .map(Employee::getName)
		         .collect(Collectors.toList());
	}
	
	
	
	public static List<Employee> createList(){
		 List<Employee> empList = Arrays.asList(new Employee("E001", 40, "Ram", 'M', 5000), 
				new Employee("E002", 35, "Sheila", 'F', 7000), 
				new Employee("E003", 24, "Mukesh", 'M', 9000), 
				new Employee("E004", 37, "Rani", 'F', 10000));

		return empList;
	}
	
	
}
