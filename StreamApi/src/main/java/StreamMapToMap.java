
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMapToMap {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		Map<Object, Object> hm2 = new HashMap<>();
		hm.put("A", "AA");
		hm.put("B", "BB");
		hm.put("C", "CC");
		hm.put("D", "DD");
		
		//hm2=hm.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,e->e.getValue()));
		hm2=hm.entrySet().stream().collect(Collectors.toMap(e->e.getValue(),Map.Entry::getKey));
		System.out.println(hm2);
		System.out.println(hm);
		
		/*hm.forEach((s1, s2) ->  hm2.put(s2, s1));
		System.out.println(hm2);
		System.out.println(hm);*/
	}
}
