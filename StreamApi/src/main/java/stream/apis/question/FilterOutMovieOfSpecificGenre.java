package stream.apis.question;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterOutMovieOfSpecificGenre {
public static void main(String[] args) {
	List<Movie> list = Arrays.asList(new Movie("Welcome","Comedy"),
			new Movie("Conjuring","Horror"),
			new Movie("The Nun","Horror"),
			new Movie("Dhamaal","Comedy"),
			new Movie("Anabelle","Horror"));
	Set<String> horrorMovie = list.stream().filter(movie -> movie.getGenre().equalsIgnoreCase("Horror"))
	.map(m -> m.getName()).collect(Collectors.toSet());
	horrorMovie.stream().forEach(System.out :: println);
}
}
