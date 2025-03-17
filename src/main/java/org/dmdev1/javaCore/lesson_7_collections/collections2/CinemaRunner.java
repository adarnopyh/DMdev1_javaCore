package org.dmdev1.javaCore.lesson_7_collections.collections2;

import org.dmdev1.javaCore.lesson_7_collections.collections1.config.JsonReader;

import java.util.*;

import static org.dmdev1.javaCore.lesson_7_collections.collections2.Utils.*;


/*
* Задание 1

Даны 2 класса:

- Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;

- Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив, где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.

Добавить функционал в кинотеатр таким образом, чтобы можно было:

- добавлять в него новый фильм

- получить все фильмы по переданному году

- получить все фильмы по переданному году и месяцу

- получить все фильмы по переданному жанру

- получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания

Учесть следующее:

- в кинотеатре фильмы должны храниться в порядке их добавления в него (т.е. предусмотреть порядок значения ассоциативного массива)

- не должен добавляться фильм, если такой уже есть в кинотеатре

Продемонстрировать работу кинотеатра в отдельном классе.*/

public class CinemaRunner {
    public static void main(String[] args) {

        List<Movie> movies = JsonReader.readMoviesFromJson("movies.json");
        Map<Integer, LinkedHashSet<Movie>> moviesByYear = new LinkedHashMap<>();

        for (Movie movie : movies) {
            addMovie(moviesByYear, movie);
        }

        System.out.println("Movies after adding:");
        printMoviesByYear(moviesByYear);

        System.out.println("Movies by year 1984:");
        System.out.println(getMoviesByYear(moviesByYear, 1984));

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
