package stream.apis.question;

import java.util.Random;
import java.util.stream.Stream;

public class Q22GenerateInfiniteSequenceOfRandomNumAndPrintFirst10 {

	public static void main(String[] args) {
		Random random = new Random();
		// Generate an infinite stream of random numbers
		Stream<Integer> randomNumbers = Stream.generate(random::nextInt);
		// Print the first 10 random numbers
        randomNumbers.limit(10).forEach(System.out::println);
	}

}
