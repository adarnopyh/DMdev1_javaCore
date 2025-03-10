package org.dmdev1.javaCore.lesson_7_collections.collections2;

import java.util.*;
import java.util.stream.Collectors;

public final class Utils {

    private Utils(){

    }

    public static boolean addMovie(Map<Integer, List<Movie>> moviesByYear, Movie movie) {
        if (!moviesByYear.containsKey(movie.getYear())) {
            moviesByYear.put(movie.getYear(), new ArrayList<>());
        }
        List<Movie> movies = moviesByYear.get(movie.getYear());
        for (Movie m : movies) {
            if (m.equals(movie)) {
                return false;
            }
        }
        movies.add(movie);
        return true;
    }

    public static List<Movie> getMoviesByYear(Map<Integer, List<Movie>> moviesByYear, int year) {
        if (moviesByYear.containsKey(year)) {
            return new ArrayList<>(moviesByYear.get(year));
        }
        return Collections.emptyList();
    }

    public static List<Movie> getMoviesByYearAndMonth(Map<Integer, List<Movie>> moviesByYear, int year, int month) {
        List<Movie> result = new ArrayList<>();
        if (moviesByYear.containsKey(year)) {
            for (Movie movie : moviesByYear.get(year)) {
                if (movie.getMonth() == month) {
                    result.add(movie);
                }
            }
        }
        return result;
    }

    public static List<Movie> getMoviesByGenre(Map<Integer, List<Movie>> moviesByYear, String genre) {
        List<Movie> result = new ArrayList<>();
        for (List<Movie> movies : moviesByYear.values()) {
            for (Movie movie : movies) {
                if (movie.getGenre().equalsIgnoreCase(genre)) {
                    result.add(movie);
                }
            }
        }
        return result;
    }

    public static List<Movie> getTop10Movies(Map<Integer, List<Movie>> moviesByYear) {
        List<Movie> allMovies = new ArrayList<>();
        for (List<Movie> movies : moviesByYear.values()) {
            allMovies.addAll(movies);
        }
        allMovies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return Double.compare(m2.getRating(), m1.getRating());
            }
        });
        return allMovies.size() > 10 ? allMovies.subList(0, 10) : allMovies;
    }

    public static void printMoviesByYear(Map<Integer, List<Movie>> moviesByYear) {
        for (Map.Entry<Integer, List<Movie>> entry : moviesByYear.entrySet()) {
            System.out.println("Year: " + entry.getKey());
            for (Movie movie : entry.getValue()) {
                System.out.println(movie);
            }
        }
    }



}
