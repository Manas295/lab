package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q11GroupListOfStringByLength {
	public static void main(String[] args) {
		/*
		  Returns a Collector implementing a "group by" operation oninput elements of type T,
		  grouping elements according to aclassification function, and returning the results in a Map. 

		  The classification function maps elements to some key type K.The collector produces a Map<K, List<T>> 
		  whose keys are thevalues resulting from applying the classification function to the inputelements, 
		  and whose corresponding values are Lists containing theinput elements which map to the associated key 
		  under the classificationfunction. 

		 */
		List<String> strings = Arrays.asList("apple","banana","plum","pomegranate",
				"grape","melon","pear","kiwi");
		Map<Integer, List<String>> lengthofstrMap = strings.stream()
		.collect(Collectors.groupingBy(String :: length));
		
		lengthofstrMap.forEach((len,list)->{
			System.out.println(len+ "->" +list);
		});
	}

}
