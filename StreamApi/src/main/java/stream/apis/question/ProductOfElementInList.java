package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductOfElementInList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		//Calculate the product of all elements using Collectors.reducing
		int product = numbers.stream()
				//Reduce method takes initial value as 1 which 
				//serves the starting point of reduction operation
				//a,b is a lamda exp that specifies how 2 elements should be 
				//combined like multiplied in this case
				.collect(Collectors.reducing(1, (a, b) -> a * b));
		System.out.println("Product of all elements: " + product);
	}
}
