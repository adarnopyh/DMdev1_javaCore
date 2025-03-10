package org.dmdev1.javaCore.lesson_7_collections.collections2;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Cinema {
    private Map<Integer, List<Movie>> moviesByYear;

    public Cinema() {
        this.moviesByYear = new TreeMap<>();
    }

    public Cinema(Map<Integer, List<Movie>> moviesByYear) {
        this.moviesByYear = new TreeMap<>(moviesByYear);
    }

    public Map<Integer, List<Movie>> getMoviesByYear() {
        return moviesByYear;
    }



}


