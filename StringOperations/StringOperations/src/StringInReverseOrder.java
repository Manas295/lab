import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringInReverseOrder {

	public static void main(String[] args) {

		String str = "shreya jain and today interview today";
		String []words = str.split(" ");
//		Arrays.asList(words).stream().map(s->s+" ").forEach(System.out::print);
//		System.out.println();
//		System.out.println("------------------");
		Collections.reverse(Arrays.asList(words));
		Arrays.asList(words).stream().map(s->s+" ").forEach(s-> System.out.print(s));
	}

}
