package org.dmdev1.javaCore.lesson_7_collections.collections2;

import java.util.*;

public final class Utils {

    private Utils() {
    }

    public static boolean addMovie(Map<Integer, LinkedHashSet<Movie>> moviesByYear, Movie movie) {
        moviesByYear.putIfAbsent(movie.getYear(), new LinkedHashSet<>());
        return moviesByYear.get(movie.getYear()).add(movie);
    }

    public static Set<Movie> getMoviesByYear(Map<Integer, LinkedHashSet<Movie>> moviesByYear, int year) {
        return moviesByYear.getOrDefault(year, new LinkedHashSet<>());
    }

    public static Set<Movie> getMoviesByYearAndMonth(Map<Integer, LinkedHashSet<Movie>> moviesByYear, int year, int month) {
        Set<Movie> result = new LinkedHashSet<>();
        if (moviesByYear.containsKey(year)) {
            for (Movie movie : moviesByYear.get(year)) {
                if (movie.getMonth() == month) {
                    result.add(movie);
                }
            }
        }
        return result;
    }

    public static Set<Movie> getMoviesByGenre(Map<Integer, LinkedHashSet<Movie>> moviesByYear, String genre) {
        Set<Movie> result = new LinkedHashSet<>();
        for (LinkedHashSet<Movie> movies : moviesByYear.values()) {
            for (Movie movie : movies) {
                if (movie.getGenre().equalsIgnoreCase(genre)) {
                    result.add(movie);
                }
            }
        }
        return result;
    }

    public static List<Movie> getTop10Movies(Map<Integer, LinkedHashSet<Movie>> moviesByYear) {
        List<Movie> allMovies = new ArrayList<>();
        for (LinkedHashSet<Movie> movies : moviesByYear.values()) {
            allMovies.addAll(movies);
        }
        allMovies.sort((m1, m2) -> Double.compare(m2.getRating(), m1.getRating()));
        return allMovies.size() > 10 ? allMovies.subList(0, 10) : allMovies;
    }

    public static void printMoviesByYear(Map<Integer, LinkedHashSet<Movie>> moviesByYear) {
        for (Map.Entry<Integer, LinkedHashSet<Movie>> entry : moviesByYear.entrySet()) {
            System.out.println("Year: " + entry.getKey());
            for (Movie movie : entry.getValue()) {
                System.out.println(movie);
            }
        }
    }
}
