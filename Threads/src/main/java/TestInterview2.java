import java.util.*;

public class TestInterview2 {

	public static void main(String[] args) {

		Map<String, List<String>> map = new HashMap<>();
		map.put("Bob", Arrays.asList("Sandra","Alice","Eric"));
		map.put("Sandra", Arrays.asList("Bob","Don"));
		map.put("Alice", Arrays.asList("Bob"));
		map.put("Eric", Arrays.asList("Bob"));
		map.put("Don", Arrays.asList("Sandra","Tim"));
		map.put("Tim", Arrays.asList("Don"));
		
		String inputStr = "Bob";
		
		List<String> friendList = map.get(inputStr);
		LinkedHashSet<String> setFrn = new LinkedHashSet<String>();
		for(String str : friendList) {
			System.out.println("Friends "+str);
			setFrn.add(str);
		}
		for(String str : setFrn) {
			map.get(str).stream().filter(str1->!setFrn.contains(str1)).forEach(System.out::println);
			setFrn.add(str);
		}
		
	}

}
