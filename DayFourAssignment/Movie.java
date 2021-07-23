/**
 *
 */
// package com.ss.jb.three;

/**
 * @author ppradhan
 *
 */
public class Movie implements Comparable<Movie>{

	private Integer year;
	private String name;
	private Float rating;

	public Movie(Integer year, String name, Float rating) {
		super();
		this.year = year;
		this.name = name;
		this.rating = rating;
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

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	@Override
	public int compareTo(Movie o) {
		return this.year - o.year;
	}

	@Override
	public String toString() {
		return "Movie [year=" + year + ", name=" + name + ", rating=" + rating + "]";
	}
}
