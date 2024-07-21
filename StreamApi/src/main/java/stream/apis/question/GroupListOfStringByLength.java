package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupListOfStringByLength {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple","banana","plum","pomegranate",
				"grape","melon","pear","kiwi");
		Map<Integer, List<String>> lengthofstrMap = strings.stream()
		.collect(Collectors.groupingBy(String :: length));
		
		lengthofstrMap.forEach((len,list)->{
			System.out.println(len+ "->" +list);
		});
	}

}
