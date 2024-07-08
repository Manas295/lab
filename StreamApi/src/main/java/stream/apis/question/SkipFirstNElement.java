package stream.apis.question;

import java.util.Arrays;
import java.util.List;

public class SkipFirstNElement {
public static void main(String[] args) {
	int n = 7;
	List<Integer> numList = Arrays.asList(2,6,8,9,4,5,100,123,145,267,908);
	
	numList.stream().skip(n-1).forEach(System.out::println);;

}
}
