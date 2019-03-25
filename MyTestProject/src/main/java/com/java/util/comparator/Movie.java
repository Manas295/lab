package com.java.util.comparator;
//A Java program to demonstrate Comparator interface
import java.io.*;
import java.util.*;

class Movie
{
	private double rating;
	private String name;
	private int year;
	
	// Constructor
	Movie(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() { return rating; }
	public String getName()   {  return name; }
	public int getYear()      {  return year;  }
}
