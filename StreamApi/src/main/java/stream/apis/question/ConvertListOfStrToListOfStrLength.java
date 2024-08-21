package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfStrToListOfStrLength {

	public static void main(String[] args) {
	    List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        List<Integer> lengths = strings.stream()
                                       .map(String::length)
                                       .collect(Collectors.toList());

        System.out.println(lengths);
	}

}
