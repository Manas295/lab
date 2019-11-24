package com.aceplan;

public class Movie {
	private String name;
	
	private Integer rating;
	
	private Integer year;


	

	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + ", year=" + year + "]";
	}

	public Movie(String name, Integer rating, Integer year) {
		super();
		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

}
