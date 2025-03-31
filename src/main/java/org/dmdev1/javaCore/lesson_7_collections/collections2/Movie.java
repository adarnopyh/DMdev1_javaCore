package org.dmdev1.javaCore.lesson_7_collections.collections2;

import java.time.Month;
import java.util.Objects;

public class Movie {
    private int id;
    private int year;
    private int month;
    private String genre;
    private double rating;

    public Movie() {
    }

    public Movie(int id, int year, int month, String genre, double rating) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        String monthName = Month.of(month).name().toLowerCase();
        monthName = monthName.substring(0, 1).toUpperCase() + monthName.substring(1);

        return "Movie with ID: " + id +
                " released in " + monthName + ' ' + year +
                ". This is a " + genre +
                " movie, with rating: " + rating + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
