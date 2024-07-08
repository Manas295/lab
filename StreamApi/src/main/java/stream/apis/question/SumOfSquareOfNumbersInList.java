package stream.apis.question;

import java.util.Arrays;
import java.util.List;

public class SumOfSquareOfNumbersInList {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(2,6,8,9,4,5);
		int sumOfSquares = numList.stream().mapToInt(i -> i*i).sum();
		System.out.println(sumOfSquares);
	}
}
