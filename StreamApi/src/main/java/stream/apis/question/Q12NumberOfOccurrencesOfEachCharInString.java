package stream.apis.question;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q12NumberOfOccurrencesOfEachCharInString {
	public static void main(String[] args) {
		String input = "hello world";
		Map<Character, Long> map = input.chars()
		.mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		map.forEach((chars,strCnt)->{
			System.out.println(chars + "=" +strCnt);
		});
	}
}
