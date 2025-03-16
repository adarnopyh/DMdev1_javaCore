package org.dmdev1.javaCore.lesson_7_collections.collections2;

import java.util.*;

public class Cinema {

    private Map<Integer, LinkedHashSet<Movie>> moviesByYear;

    public Cinema() {
        this.moviesByYear = new LinkedHashMap<>();
    }

    public Cinema(Map<Integer, LinkedHashSet<Movie>> moviesByYear) {
        this.moviesByYear = new LinkedHashMap<>(moviesByYear);
    }

    public Map<Integer, LinkedHashSet<Movie>> getMoviesByYear() {
        return moviesByYear;
    }
}


