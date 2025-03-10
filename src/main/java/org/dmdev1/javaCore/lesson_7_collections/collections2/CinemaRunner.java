package org.dmdev1.javaCore.lesson_7_collections.collections2;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.dmdev1.javaCore.lesson_7_collections.collections2.Utils.*;

public class CinemaRunner {
    public static void main(String[] args) {
        Map<Integer, List<Movie>> moviesByYear = new TreeMap<>();

        Movie movie1 = new Movie(1, 2022, 5, "Adventure", 8.5);
        Movie movie2 = new Movie(2, 2021, 7, "Family", 7.8);
        Movie movie3 = new Movie(3, 2022, 5, "Drama", 9.0);
        Movie movie4 = new Movie(4, 2021, 4, "Comedy", 5.9);
        Movie movie5 = new Movie(5, 2023, 3, "Thriller", 6.5);
        Movie movie6 = new Movie(6, 2021, 10, "Action", 7.3);
        Movie movie7 = new Movie(7, 1983, 4, "Sci-Fi", 6.8);
        Movie movie8 = new Movie(8, 2024, 6, "Arthouse", 8.7);
        Movie movie9 = new Movie(9, 1957, 3, "Mystery", 9.1);
        Movie movie10 = new Movie(10, 2021, 4, "Action", 6.4);

        addMovie(moviesByYear, movie1);
        addMovie(moviesByYear, movie2);
        addMovie(moviesByYear, movie3);
        addMovie(moviesByYear, movie4);
        addMovie(moviesByYear, movie5);
        addMovie(moviesByYear, movie6);
        addMovie(moviesByYear, movie7);
        addMovie(moviesByYear, movie8);
        addMovie(moviesByYear, movie9);
        addMovie(moviesByYear, movie10);

        System.out.println("Movies by year 2022:");
        System.out.println(getMoviesByYear(moviesByYear, 2022));

        System.out.println("Movies by year 2021 and month 7:");
        System.out.println(getMoviesByYearAndMonth(moviesByYear, 2021, 7));

        System.out.println("Movies by genre \"Action\":");
        System.out.println(getMoviesByGenre(moviesByYear, "Action"));

        System.out.println("Top 10 movies:");
        System.out.println(getTop10Movies(moviesByYear));

        System.out.println("All movies by year:");
        printMoviesByYear(moviesByYear);
    }
}
