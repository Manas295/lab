package stream.apis.question;

public class Movie {
	private String name;
	private String genre;
	public Movie(String name, String genre) {
		super();
		this.name = name;
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public String getGenre() {
		return genre;
	}

}
