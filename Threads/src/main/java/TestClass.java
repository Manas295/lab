import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {

	public static void main(String[] args) {
//		List<String> listOfWords = Arrays.asList("Peter", "John", "Mathew", "Pete", "John", "Mathew");
//		
//		listOfWords.stream().collect(Collectors.groupingBy(str->str,Collectors.counting()))
//		.entrySet().forEach(entry-> System.out.println(entry.getKey()+" ---- "+entry.getValue()));
//		
	
			//.skip(3).forEach(System.out::println);
//		List<Integer> listOfIntegers1 = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
//		listOfIntegers1.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()))
//		.entrySet().stream().filter(ent->ent.getValue() >1).collect(Collectors.toList()).forEach(System.out::println);
//		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
//		int sum = integers.stream().mapToInt(i->i).sum();
//		System.out.println(sum);
		
		
		int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
		int index =0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0){
				arr[index] = arr[i];
				index++;
			}
		}
		for(int i=index ; i<arr.length;i++) {
			arr[i] = 0;
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		List<Integer> listOfIntegers = Arrays.asList(50, 42, 26, 85, 74, 67, 88, 22);
		listOfIntegers.stream().sorted((a,b)->Integer.compare(b,a))
		.limit(3).collect(Collectors.toList()).forEach(System.out::println);
		
		
		//(Comparator.comparing((a,b)-> Integer.compare(a,b))).limit(3);		
}
}
