import java.util.*;

public class TestInterview {

	public static int evaluateExpression(String expression, Map<Character, Integer> variables) {

		return 0;

	}

	public static void main(String[] args) {

		String expression = "((a + b - (c * d / e)) * (f - g + h) / ((i + j - k) * l)) + (m - (n * o / p))";
		Map<String, Integer> variables = new HashMap<>();

		variables.put("a", 10);

		variables.put("b", 20);

		variables.put("c", 5);

		variables.put("d", 4);

		variables.put("e", 2);

		variables.put("f", 50);

		variables.put("g", 30);

		variables.put("h", 10);

		variables.put("i", 15);

		variables.put("j", 10);

		variables.put("k", 5);

		variables.put("l", 3);

		variables.put("m", 40);

		variables.put("n", 8);

		variables.put("o", 4);

		variables.put("p", 2);

		//int result = evaluateExpression(expression, variables);

//		System.out.println("Result: " + result);

	}

}
