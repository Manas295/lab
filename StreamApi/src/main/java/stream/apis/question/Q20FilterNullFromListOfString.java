package stream.apis.question;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q20FilterNullFromListOfString {
public static void main(String[] args) {
	List<String> strings = new ArrayList<>();
    strings.add("one");
    strings.add(null);
    strings.add("two");
    strings.add(null);
    strings.add("three");
    
    List<String> listOfStr = strings.stream().filter(str->str!=null).collect(Collectors.toList());
    
    System.out.println(listOfStr);
}
}
